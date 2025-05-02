import java.util.Scanner;
//Check if Array is a subset of another array or not
public class ArraySubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length of the second array:");
        int len2 = sc.nextInt();

        int[] arr2 = new int[len2];
        for (int i = 0; i < len2; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        boolean[] flag = new boolean[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            if (flag[i]) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i] == arr[j]) {
                    flag[i] = true;
                }
            }
        }
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == false) {
                System.out.println("Array 1 is not a subest of Array 2");
                return;
            }
        }
        System.out.println("Array 1 is  a subest of Array 2");
    }
}
