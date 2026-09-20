package PatternPrinting;
import java.util.Scanner;
public class Ascii_flip_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }

    }
}
