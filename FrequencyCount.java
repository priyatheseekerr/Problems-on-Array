import java.util.Scanner;
//Count frequency of each element in an array
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] flag = new boolean[len];
        for (int i = 0; i < len; i++) {
            int count = 1;
            if (flag[i]) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    flag[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
        sc.close();
    }
}