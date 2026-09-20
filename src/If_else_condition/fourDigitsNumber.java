package If_else_condition;

import java.util.Scanner;

public class fourDigitsNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int n = sc .nextInt();
        if(n>999 && n<10000){
            System.out.println("it is four digits number:");
        }else{
            System.out.println("it is not four digits number:");
        }
    }

}
