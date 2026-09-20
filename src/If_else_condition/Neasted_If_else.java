package If_else_condition;

import java.util.Scanner;

public class Neasted_If_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        System.out.println("Enter your third number:");
        int c = sc.nextInt();
        if(a>b){
            if(a>c) {
                System.out.println(a);
            }
            else
                System.out.println("your greater number is:"+c);
        }
        else{
            if(b>=c)
                System.out.println("your greater number is:"+b);
            else{
                System.out.println("your greater number is:"+c);
            }

        }
    }
}

