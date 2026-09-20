package Arrays;
import java.util.Scanner;
public class ReverseArray_usingFor_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int n =  sc.nextInt();
        int [] arr =  new int[n];
        System.out.println("Enter your Arrays elements:");
        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int ele:arr){
            System.out.println(ele+" ");
        }
    }
}
