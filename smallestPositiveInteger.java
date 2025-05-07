import java.util.Scanner;
//Find the smallest missing positive integer in an unsorted array
public class smallestPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 1;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < len; i++) {
                if (arr[i] == num) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
            num++;
        }
        System.out.println(num);
        sc.close();
    }
}
