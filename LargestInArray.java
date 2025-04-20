import java.util.Arrays;
import java.util.Scanner;
//Find the largest number in an array
public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int len=sc.nextInt();

        int[] arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Largest element in the array is : "+arr[len-1]);
        sc.close();
    }
}
