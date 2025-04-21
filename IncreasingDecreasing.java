import java.util.Arrays;
import java.util.Scanner;
//Rearrange array in increasing-decreasing order
public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mid = len / 2;
        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = len - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
