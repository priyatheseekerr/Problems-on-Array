import java.util.Scanner;
//Maximum sum in a subarray
public class SubarrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int curSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int temp = curSum + arr[i];
            if (temp < arr[i]) {
                curSum = arr[i];
            } else {
                curSum = temp;
            }
            if (max<curSum) {
                max = curSum;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
