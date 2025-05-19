import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the elment to delete: ");
        int element = sc.nextInt();
        for (int n : arr) {
            if (n != element) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}
