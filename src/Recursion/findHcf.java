package Recursion;
import  java.util.Scanner;
public class findHcf {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your a number :");
        int a  = sc.nextInt();
        System.out.println("Enter your b number :");
        int b = sc.nextInt();
        int ans = hcf(a,b);
        System.out.println(ans+" ");
    }
    public static int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
