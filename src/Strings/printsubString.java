package Strings;
import java.util.Scanner;
public class printsubString {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your  ");
       String s = "vijay";
       for(int i = 0;i<s.length();i++){
           for(int j = i;j<s.length();j++){
               System.out.print(s.substring(i,j+1)+" ");
           }
           System.out.println();
       }
   }
}
