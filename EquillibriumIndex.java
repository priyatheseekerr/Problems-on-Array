import java.util.Scanner;
//Finding equilibrium index of an array
public class EquillibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            int right = 0;
            int left = 0;
            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int j = i + 1; j < len; j++) {
                right += arr[j];
            }
            if (right == left) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
