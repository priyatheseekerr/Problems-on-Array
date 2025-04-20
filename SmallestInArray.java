import java.util.Arrays;
import java.util.Scanner;
//Find the smallest number in an array
public class SmallestInArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int len=sc.nextInt();

        int[] arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Smallest element in the array is : "+arr[0]);
        sc.close();
    }
}