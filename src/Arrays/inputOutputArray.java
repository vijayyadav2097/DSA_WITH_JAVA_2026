package Arrays;
import java.util.Scanner;
public class inputOutputArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array elements:");
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
      //  System.out.println(arr.length);
            // print arrays elements
            for(int i = 0;i<arr.length;i++){
                if(arr[i]<0)
                System.out.print(arr[i]+" ");
        }
    }
}