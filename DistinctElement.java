import java.util.Scanner;
//Find the maximum sum subarray with at most K distinct elements
public class DistinctElement {
    public static int maxSumSubarray(int[] arr, int k) {
        int[] freq = new int[101];
        int left = 0;
        int maxSum = 0;
        int currentSum = 0;
        int distinctCount = 0;

        for (int right = 0; right < arr.length; right++) {
            if (freq[arr[right]] == 0) {
                distinctCount++;
            }
            freq[arr[right]]++;
            currentSum += arr[right];

            while (distinctCount > k) {
                freq[arr[left]]--;
                currentSum -= arr[left];
                if (freq[arr[left]] == 0) {
                    distinctCount--;
                }
                left++;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the array element :");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k distinct element: ");
        int k = sc.nextInt();
        System.out.println(maxSumSubarray(arr, k));
        sc.close();
    }
}
