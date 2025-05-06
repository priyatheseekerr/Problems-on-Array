import java.util.Scanner;

//Find the longest subarray with equal number of 0s and 1s
public class EqualZeroAndOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = 0, start = -1, end = -1;
        for (int i = 0; i < len; i++) {
            int ZeroCount = 0;
            int OnesCount = 0;
            for (int j = i; j < len; j++) {
                if (arr[j] == 0)
                    ZeroCount++;
                else
                    OnesCount++;
                if (ZeroCount == OnesCount && (j - i + 1) > maxLen) {
                    maxLen = (j - i + 1);
                    start = i;
                    end = j;
                }
            }
        }
        if (maxLen != 0) {
            System.out.println("There is  equal number of 0's and one's");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("There is no equal number of 0's and one's");
        }
        sc.close();
    }
}
