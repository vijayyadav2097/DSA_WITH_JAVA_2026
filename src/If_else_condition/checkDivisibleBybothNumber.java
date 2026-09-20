package If_else_condition;
import java.util.Scanner;
public class checkDivisibleBybothNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("divisible by both number:");
        }else{
            System.out.println("Not divisible by both number:");
        }
    }

}
