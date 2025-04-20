//Reverse a given array

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = len - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        sc.close();
    }
}
