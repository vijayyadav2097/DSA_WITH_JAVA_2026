package Strings;
import java.util.Scanner;
public class checkPalindrome {
    public static boolean palindrom(String a) {
        int i = 0, j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String a =  sc.nextLine();
        boolean ans = palindrom(a);
        System.out.println(ans+" ");

    }
}
