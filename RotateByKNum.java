import java.util.Arrays;
import java.util.Scanner;
//	Rotate array by K elements 
public class RotateByKNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        System.out.print("Enter number of rotation: ");
        int k = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        k = k % len;
        int[] rotated=new int[len];
       for(int i=0;i<len;i++){
        rotated[i]=arr[(i+k)%len];
       }
        System.out.println(Arrays.toString(rotated));
        sc.close();
    }
}
