package method;

import java.util.Scanner;

public class MaximunThreeNumberusing_builten {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(" your maximum value is :"+ Math.max(Math.max(a,b),c));
        System.out.println("Your minimum value is : "+Math.min(Math.min(a,b),c));
    }

}
