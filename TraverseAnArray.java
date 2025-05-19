import java.util.Scanner;

public class TraverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
