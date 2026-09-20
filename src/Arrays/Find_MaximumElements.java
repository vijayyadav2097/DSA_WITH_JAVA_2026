package Arrays;
import java.util.Scanner;
public class Find_MaximumElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter your array elements:");
        for(int i =0 ;i<arr.length;i++){
            arr[i]  = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Your maximum value is :"+max);
    }
}
