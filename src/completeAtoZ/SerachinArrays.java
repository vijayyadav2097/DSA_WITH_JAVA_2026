package completeAtoZ;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SerachinArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your target elements :");
        int vijay = sc.nextInt();
        int[] arr  = {23,435,67,8,5,87,56,87,5,6754};

        boolean flag = false;
        for(int i  = 0;i<arr.length;i++){
            if(arr[i] == vijay){
                flag = true;
            }
        }
        if( flag == true) System.out.println("Elements  exist  in arrays");
        else System.out.println("elements are not exist in arrays:");
    }
}
