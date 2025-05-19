import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        try {
            System.out.println("enter the elment to insert: ");
            int element = sc.nextInt();
            System.out.println("enter the position to insert: ");
            int pos = sc.nextInt();
            arr[pos] = element;
            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("Array index out of bond ");
        }

        sc.close();
    }
}
