import java.util.Scanner;
//Maximum product subarray in an array
public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr));
        sc.close();
    }

    static int max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int tempmax = max;

            max = Math.max(arr[i], Math.max(max * arr[i], min * arr[i]));
            min = Math.min(arr[i], Math.min(tempmax * arr[i], min * arr[i]));
            result = Math.max(max, result);
        }
        return result;
    }
}
