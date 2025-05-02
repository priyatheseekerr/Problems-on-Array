import java.util.Arrays;
import java.util.Scanner;
//	Rotation of elements of array- left and right
public class LeftAndRightRotation {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int len = sc.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotation: ");
        int k = sc.nextInt();
        k = k % len;
        System.out.println("Array before rotation: "+Arrays.toString(arr));
        Left(arr,k,len);
        Right(arr, k, len);
        sc.close();

    }
    static void Left(int[] arr,int k ,int len){
        int[] rotated=new int[len];
        for(int i=0;i<len;i++){
            rotated[i]=arr[(i+k)%len];
        }
        System.out.println("Left rotation :"+Arrays.toString(rotated));
    }
    static void Right(int[] arr,int k ,int len){
        int[] rotated=new int[len];
        for(int i=0;i<len;i++){
            rotated[(i+k)%len]=arr[i];
        }
        System.out.println("Right rotation :"+Arrays.toString(rotated));
    }
}
