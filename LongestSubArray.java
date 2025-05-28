import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Longest subarray with given sum (only positive numbers)
public class LongestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Array  length:");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        System.out.println(sub(arr, target));
        sc.close();
    }

    static int sub(int[] arr, int k) {
        int sum = 0;
        int end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                end = i + 1;
            } else if (map.containsKey(sum - k)) {
                end = Math.max(end, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return end;
    }
}
