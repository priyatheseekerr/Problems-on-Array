import java.util.Scanner;
//Find intersection of two arrays
public class IntersectionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length  of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length  of the second array: ");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] result = new int[len + len1];
        int k = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len1; j++) {
                if (arr[i] == arr1[j] && !check(result, k, arr[i])) {
                    result[k++] = arr[i];
                    break;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }

    static boolean check(int[] result, int k, int value) {
        for (int i = 0; i < k; i++) {
            if (result[i] == value) {
                return true;
            }
        }
        return false;
    }
}
