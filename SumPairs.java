import java.util.Scanner;
//Finding all pairs that sum to a given value
public class SumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int count = 0;
        int sum = arr[0] + arr[1];
        for (int i = 1; i < len - 1; i++) {
            if (sum == target) {
                count++;
                System.out.println(arr[i - 1] + "," + arr[i]);
            }
            sum = sum + arr[i + 1] - arr[i - 1];
        }
        System.out.println(count);
        sc.close();
    }
}
