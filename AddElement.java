import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[len + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("enter the element to add:");
        newArr[newArr.length - 1] = sc.nextInt();
        System.out.println(Arrays.toString(newArr));
        sc.close();
    }
}
