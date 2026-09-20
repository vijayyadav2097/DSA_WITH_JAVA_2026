package PatternPrinting;

import java.util.Scanner;

public class SquarePrinting {
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= sc. nextInt();
        for(int i =1;i<=n;i++){
            for(int j= 1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
