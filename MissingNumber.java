import java.util.Arrays;
import java.util.Scanner;
//	Find missing number in an array
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < len; i++) {
            if ((i + 1) != arr[i]) {
                System.out.println("The missing element in the array is : " + (i + 1));
                break;
            }
        }
        sc.close();
    }
}
