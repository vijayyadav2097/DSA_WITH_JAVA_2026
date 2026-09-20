package Arrays;
import java.util.Scanner;
public class Two_Sum {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your arrays size:");
      int n = sc.nextInt();
      int[] arr = new int[n];
        System.out.println("Enter your arrays elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
            System.out.println("Enter your target elements:");
            int target = sc.nextInt();
       System.out.println(twosum(arr,target));
    }
    public static boolean twosum(int[] arr ,int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
            return false;
        }
    }
