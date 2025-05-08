import java.util.Arrays;
import java.util.Scanner;
//Merge two sorted arrays without using extra space
public class MergeTwoSortedArray {
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
        sc.close();
        int[] res = merge(arr_1, arr_2);
        System.out.println(Arrays.toString(res));

    }

    static int[] merge(int[] sub, int[] sub1) {
        int n1 = sub.length;
        int n2 = sub1.length;
        int[] arr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (sub[i] <= sub1[j]) {
                arr[k++] = sub[i++];
            } else {
                arr[k++] = sub1[j++];
            }
        }
        while (i < n1) {
            arr[k++] = sub[i++];
        }
        while (j < n2) {
            arr[k++] = sub1[j++];
        }
        return arr;
    }
}
