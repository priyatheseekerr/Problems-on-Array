import java.util.Arrays;
import java.util.Scanner;
//Finding Kth largest/smallest element
public class KthLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Kth smallest to find: ");
        int small = sc.nextInt();
        System.out.println("Enter the Kth Largest to find: ");
        int large = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(small + "th smallest in the array is : " + arr[small - 1]);
        System.out.println(large + "th Largest in the array is : " + arr[len - large]);
        sc.close();
    }
}
