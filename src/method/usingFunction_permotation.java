package method;

import java.util.Scanner;

public class usingFunction_permotation {
    public static int fact(int x){
        int vijay = 1;
        for(int i =1;i <= x;i++){
            vijay *= i;
        }
        return vijay;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n value:");
        int n = sc.nextInt();
        System.out.println("Enter your r value:");
        int r = sc.nextInt();
        int ncr = fact (n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
    }

}
