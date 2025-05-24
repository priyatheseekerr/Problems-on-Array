import java.util.Arrays;
import java.util.Scanner;
//	Left rotate array by D place
public class LeftRotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter how may times to rotate: ");
        int k=sc.nextInt();
        rotate(arr, len, k);
        sc.close();

    }

    static void rotate(int[] arr, int len, int k) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = arr[(i + k) % len];
        }
        System.out.println(Arrays.toString(result));
    }
}
