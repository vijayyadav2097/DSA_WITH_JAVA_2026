package Arrays;
import java.util.Scanner;
public class SecondMax_elements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter your arrays elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // print maximum  number;
        for(int  i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
            // print Second maximum number
            for(int i = 0;i<arr.length;i++){
                if(arr[i]> secondMax  && max!=arr[i]){
                    secondMax = arr[i];
            }
        }
        System.out.println(" The Maximum elements is "+max);
        System.out.println("The second maximum elements is:"+secondMax);
    }
}
