package PatternPrinting;
import java.util.Scanner;
public class numberStartriangle {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int  j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
