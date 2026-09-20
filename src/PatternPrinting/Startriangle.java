package PatternPrinting;
import java.util.Scanner;
public class Startriangle {
   // public static void main(String args[]){
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int  n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j = 1 ;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}
        public static void main(String ags[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 1;i<=n;i++){
                for(int j =1 ; j<=i;j++){
                    System.out.print("V"+" ");
                }
                System.out.println();
            }
        }

    }
