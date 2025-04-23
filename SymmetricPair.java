import java.util.Scanner;
//Find all symmetric pairs in array
public class SymmetricPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of pair : ");
        int len = sc.nextInt();

        int[][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The symmetric pairs are: ");
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println("[ " + arr[i][0] + " , " + arr[i][1] + " ] " + " , [ " + arr[j][0] + " , "
                            + arr[j][1] + " ]");
                }
            }
        }
        sc.close();

    }
}
