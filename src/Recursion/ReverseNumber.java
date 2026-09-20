package Recursion;
import java.util.Scanner;
public class ReverseNumber {
    public static   int  reverse(int n,int r) {
        if (n == 0) return r;
         return reverse(n / 10, r * 10 + n % 10);
    }
    public static void main(String args[]){
        int n = 2345;
        System.out.println(reverse(n,0));
//        if (n == 0){
//            System.out.println(r);
//        return;
//    }
//        reverse(n/10,r*10+n%10);
//
//    }
//    public static void main(String args[]) {
//        int n = 12314;
//        reverse(n,0);

    }
}
