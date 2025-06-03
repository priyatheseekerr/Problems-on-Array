import java.util.Scanner;
//Rearrange array in alternating positive and negative
public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array element:");
        int[] pops = new int[len];
        int[] neg = new int[len];
        int posCount = 0, NegCount = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) {
                pops[posCount] = arr[i];
                posCount++;
            } else {
                neg[NegCount] = arr[i];
                NegCount++;
            }
        }
        int i = 0, j = 0;
        while (i < posCount || j < NegCount) {
            if (i < posCount) {
                System.out.print(pops[i++]+" ");
            }
            if (j < NegCount) {
                System.out.print(neg[j++]+" ");
            }
        }

        sc.close();
    }
}
