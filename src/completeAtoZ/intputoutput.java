package completeAtoZ;

import java.util.Scanner;

public class intputoutput {
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Arrays size :");
        int n = sc.nextInt();
        System.out.println("Enter  your arrays elements");
        int[] arr = new int[n];
        for(int i  = 0; i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
