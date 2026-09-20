package Recursion;
import java.util.Scanner;
public class sumNnaturalnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("The sum of n natural number of :"+" "+sum);
    }
    public static  int   sum(int n ){
        if(n == 0 ) return 0 ;
        return n + sum(n-1);
    }
}
