package completeAtoZ;

import java.util.Scanner;

public class findPowerSet {
    public static int  power(int a, int b){
         if( b == 0) return 1;
         if(b%2==0) return power(a,b/2)*power(a,b/2);
         else{
           return  a* power(a,b/2)*power(a,b/2);
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base value :");
        int a = sc.nextInt();
        System.out.println("Enter  your exponents value:");
        int b = sc.nextInt();
        int ans = power(a,b);
        System.out.println(ans+" ");

    }
}
