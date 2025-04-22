import java.util.Arrays;
import java.util.Scanner;
//	Adding Element in an array
public class AddElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        System.out.println("Enter the value of array: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position to insert the element (0 to " + len + ") : ");
        int pos = sc.nextInt();

        System.out.println("Array before adding element: " + Arrays.toString(arr));

        arr[pos] = element;

        System.out.println("Array after adding element: " + Arrays.toString(arr));
        sc.close();
    }
}
