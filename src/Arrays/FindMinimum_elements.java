package Arrays;
import java.util.Scanner;
public class FindMinimum_elements {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your arrays size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your arrays elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int   i = 0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("Your minimum value is :"+min+" ");
        }
     }

