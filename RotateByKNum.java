import java.util.Arrays;
import java.util.Scanner;
//	Rotate array by K elements 
public class RotateByKNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        System.out.print("Enter number of rotation: ");
        int k = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        k = k % len;
        while (k > 0) {
            for (int i = 1; i < len; i++) {
                arr[i - 1] = arr[i];
            }
            arr[len - 1] = arr[0];
            k--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
