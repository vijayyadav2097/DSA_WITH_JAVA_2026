package If_else_condition;

import java.util.Scanner;

public class greaterThreeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int  b  = sc.nextInt();
        System.out.println("Enter your third number:");
        int   c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }else if(b>=c && b>=a){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }

}
