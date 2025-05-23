import java.util.Arrays;
import java.util.Scanner;
//Move all zeros to the end
public class ZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array element: ");
        int[] result = new int[len];
        int k = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] != 0) {
                result[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
