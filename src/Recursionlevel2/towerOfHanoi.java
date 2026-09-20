package Recursionlevel2;
import java.util.Scanner;
public class towerOfHanoi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        hanoi(n,'A','B','C');
    }
    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b);
        System.out.println(a+"--> "+c);
        hanoi(n-1,b,a,c);

    }
}
