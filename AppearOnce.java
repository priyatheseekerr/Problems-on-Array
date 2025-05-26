import java.util.Scanner;
//Numbers that appear once while others appear twice
public class AppearOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(arr[i]);
                 count = 0;
            }
        }
        sc.close();
    }
}