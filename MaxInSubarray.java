import java.util.Scanner;
//	Maximum product subarray in an array
public class MaxInSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subArray(arr));
        sc.close();
    }

    static int subArray(int[] arr) {
        int sum = 0, max = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
        
    }
}
