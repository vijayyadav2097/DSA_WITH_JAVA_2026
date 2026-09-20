package Arrays;
import java.util.Scanner;
//import java.util.Arrays;
public class Wave_Array {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(arr);

        wave(arr);
    }
        public static void  wave(int[] arr){
         for(int i =  0;i<arr.length;i+=2){
             if(i== arr.length-1)
                 break;
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
         }
         for(int ele:arr){
             System.out.print(ele+" ");
         }

        }
    }

