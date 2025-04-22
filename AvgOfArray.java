import java.util.Scanner;
//	Average of all elements in an array
public class AvgOfArray {
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
        double avg = (count / len);
        System.out.println("Average of the array is : " + avg);
        sc.close();
    }
}
