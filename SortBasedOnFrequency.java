import java.util.Scanner;

public class SortBasedOnFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] sort = new int[len][2];
        boolean[] flag = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (!flag[i]) {
                int count = 1;
                for (int j = i + 1; j < len; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        flag[j] = true;
                    }
                }
                sort[i][0] = arr[i];
                sort[i][1] = count;
            } else {
                sort[i][1] = -1;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (sort[i][1] < sort[j][1]) {
                    int[] temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                } else if (sort[i][1] == sort[j][1] && sort[i][0] > sort[j][0]) {
                    int[] temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            if (sort[i][1] > 0) {
                for (int j = 0; j < sort[i][1]; j++) {
                    System.out.print(sort[i][0] + " ");
                }
            }
        }
        sc.close();
    }
}
