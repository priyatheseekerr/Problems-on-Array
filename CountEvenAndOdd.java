import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        int evenCount = 0, oddCount = 0;
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count: " + evenCount + "\n" + "Odd count: " + oddCount);
        sc.close();
    }
}
