import java.util.Scanner;
//	Maximum consecutive 1s
public class MaxConsecutive1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array element:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
