import java.util.Arrays;
import java.util.Scanner;
//Find the maximum and minimum element in an array
public class MaxAndMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Minimum element in the array is : " + arr[0]);
        System.out.println("Maximum in the array element is : " + arr[arr.length - 1]);
        sc.close();
    }
}
