package If_else_condition;
import java.util.Scanner;
public class checksidesOfTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int A = sc.nextInt();
        System.out.println("Enter your second number:");
        int B = sc.nextInt();
        System.out.println("Enter your third number:");
        int C = sc.nextInt();
        if(A+B>C && B+C>A && C+A>B){
            System.out.println("VALID TRIANGLE");
        }else{
            System.out.println("NOT VALID TRIANGLE");
        }
    }

}
