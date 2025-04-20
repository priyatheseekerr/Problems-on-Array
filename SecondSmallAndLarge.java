//	Second Smallest and Second Largest element in an array

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallAndLarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len=sc.nextInt();

        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second samllest in the array is : "+arr[1]);
        System.out.println("Second Largest in the array is : "+arr[len-2]);
        sc.close();
    }
}
