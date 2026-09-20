package Arrays;
import java.util.Scanner;
public class ReverseArray_elements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your Arrays elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int i = 0 , j = n-1;
        while(i<j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
