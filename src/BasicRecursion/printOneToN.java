package BasicRecursion;
import java.util.Scanner;
public class printOneToN {
    public static void print(int x, int n){
        if(x>n) return;
        print(x+1, n);
        System.out.print(x+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        print(1,n);

    }
}
