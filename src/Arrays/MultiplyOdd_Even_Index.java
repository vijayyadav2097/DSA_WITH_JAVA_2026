package Arrays;
import java.util.Scanner;
public class MultiplyOdd_Even_Index {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your arrays size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your arrays elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
            for(int i = 0;i<arr.length;i++){
                if(i%2==1){
                arr[i]*=2;
            }else{
               arr[i]+=10;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
