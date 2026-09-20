package If_else_condition;

import java.util.Scanner;

public class IsIntegers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        double n = sc.nextDouble();
        int x =( int)n;
        if(n-x==0){
            System.out.println("Is integers: ");
        }else{
            System.out.println("IS Not integers:");
        }

    }

}
