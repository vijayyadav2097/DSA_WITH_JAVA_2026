package Arrays;
import java.util.Scanner;
public class SumOfArrayElements {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your arrays elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            System.out.print(" The sum of elements is :"+sum + " ");
        }
    }

