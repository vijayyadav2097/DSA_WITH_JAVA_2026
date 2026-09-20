package Arrays;
import java.util.Scanner;
public class Segregate_1s_0s {
    public static void  main(String args[]){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size:");
      int n = sc.nextInt();
      int[] arr = new int[n];
        System.out.println("Enter your array elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        segregate(arr);
    }
    public static void segregate (int[] arr){
        int n = arr.length;
        int i =0;
        int j = n-1;
        while(i<j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
            for(int ele:arr){
                System.out.print(ele+" ");
            }

        }
    }

