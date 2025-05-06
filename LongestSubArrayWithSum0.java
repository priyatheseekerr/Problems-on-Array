import java.util.Scanner;

//Find the length of the longest subarray with a sum of 0
public class LongestSubArrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of the arrayt: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int maxlen = 0, start = -1, end = -1;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if (sum == 0 && (j - i + 1) > maxlen) {
                    maxlen = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        if (maxlen == 0) {
            System.out.println("There is no longest subarray");
        } else {
            System.out.println("The longest subarray with sum 0 is : ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("Length : " + start + " - " + end);
        }
        sc.close();
    }

}