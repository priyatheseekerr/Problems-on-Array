import java.util.Scanner;
//	Search an element in an array
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        boolean flag = false;
        System.out.println("Enter the array elements: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == target) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
        sc.close();
    }
}
