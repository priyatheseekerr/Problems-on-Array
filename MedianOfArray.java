import java.util.Arrays;
import java.util.Scanner;
//	Find the median of the given array
public class MedianOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (len % 2 != 0) {
            int median = len / 2;
            System.out.print("Median of the array is : " + arr[median]);
        } else {
            int median = len / 2;
            double ans = (arr[median] + arr[median - 1]) / 2;
            System.out.print(ans);
        }
        sc.close();
    }
}
