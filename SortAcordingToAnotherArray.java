import java.util.Arrays;
import java.util.Scanner;
//	Sort an array according to the order defined by another array
public class SortAcordingToAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array 1: ");
        int len_1 = sc.nextInt();

        int[] arr_1 = new int[len_1];
        for (int i = 0; i < len_1; i++) {
            arr_1[i] = sc.nextInt();
        }
        System.out.println("Enter the length of the array 2: ");
        int len_2 = sc.nextInt();

        int[] arr_2 = new int[len_2];
        for (int i = 0; i < len_2; i++) {
            arr_2[i] = sc.nextInt();
        }
        int[] result = new int[len_1];
        int[] rem = new int[len_1];
        boolean[] flag = new boolean[len_1];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < len_2; i++) {
            for (int j = 0; j < len_1; j++) {
                if (arr_2[i] == arr_1[j] && !flag[j]) {
                    result[index1++] = arr_1[j];
                    flag[j] = true;
                }
            }
        }
        for (int i = 0; i < len_1; i++) {
            if (!flag[i]) {
                rem[index2++] = arr_1[i];
            }
        }
        Arrays.sort(rem, 0, index2);
        System.out.println("Array after sorting :");
        for (int i = 0; i < index1; i++) {
            System.out.print(result[i] + " ");
        }
        for (int i = 0; i < index2; i++) {
            System.out.print(rem[i] + " ");
        }
        sc.close();
    }
}
