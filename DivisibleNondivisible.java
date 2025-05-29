import java.util.Scanner;
//Divisible and Non-divisible Sums Difference
public class DivisibleNondivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the range : ");
        int end = sc.nextInt();
        System.out.println(sum(n, end));
        sc.close();
    }

    static int sum(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }
}
