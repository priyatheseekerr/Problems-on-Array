import java.util.Arrays;
import java.util.Scanner;
// Replace each element of the array by its rank in the array
public class ElementRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ogArr = Arrays.copyOf(arr, len);

        Arrays.sort(arr);

        int[] rank = new int[len];
        int index = 1;

        for (int i = 0; i < len; i++) {
            if (i > 0 && arr[i] != arr[i - 1]) {
                index++;
            }
            for (int j = 0; j < len; j++) {
                if (ogArr[j] == arr[i]) {
                    rank[j] = index;
                }
            }
        }
        System.out.println(Arrays.toString(rank));
        sc.close();
    }
}
