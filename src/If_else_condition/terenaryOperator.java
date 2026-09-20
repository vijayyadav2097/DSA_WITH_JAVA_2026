package If_else_condition;
import java.util.Scanner;
public class terenaryOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  number");
        int n = sc.nextInt();
//        if(n%2==0){
//            System.out.println("EVEN");
//       }else{
//        System.out.println("ODD");
        System.out.println((n%2==0) ? "EVEN":"ODD");
    }

}
