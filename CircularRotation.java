import java.util.Arrays;
import java.util.Scanner;
//Finding Circular rotation of an array by K positions
public class CircularRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotation: ");
        int k = sc.nextInt();
        k = k % len;
        System.out.println(Arrays.toString(arr));
        int[] rotated = new int[len];
        for (int i = 0; i < len; i++) {
            rotated[(i + k) % len] = arr[i];
        }
        System.out.println(Arrays.toString(rotated));
        sc.close();
    }
}
