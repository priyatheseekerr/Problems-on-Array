import java.util.Arrays;
import java.util.Scanner;
//	Remove duplicates from a sorted array
public class DuplicateRemoveSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        boolean[] flag = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (flag[i]) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    flag[i] = true;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (flag[i] == false) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}