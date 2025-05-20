import java.util.Arrays;
import java.util.Scanner;
//Rearrange array in increasing-decreasing order
public class IncreasingAndDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        order(arr);
        sc.close();
    }

    static void order(int[] arr) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, index = 0;
        int[] newArr = new int[arr.length];
        while (start <= end) {
            newArr[index++] = arr[start++];
            newArr[index++] = arr[end--];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
