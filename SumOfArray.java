import java.util.Scanner;
//	Calculate sum of the elements of the array
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            count += arr[i];
        }
        System.out.println("Sum of the array is : " + count);
        sc.close();
    }
}
