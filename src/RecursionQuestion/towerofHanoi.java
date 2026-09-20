package RecursionQuestion;
import java.util.Scanner;
public class towerofHanoi {
    public static void tower(int n , char a, char b,char c){
        if(n == 0) return;
        System.out.println("Move disk " + n + " from " + a + " to " + c);
        tower(n-1,a,c,b);
        tower(n-1,b,c,a);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your number :");
      tower(5, 'A', 'B', 'C');
    }
}
