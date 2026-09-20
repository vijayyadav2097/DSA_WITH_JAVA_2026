package If_else_condition;

import java.util.Scanner;

public class checkConditionPrintname {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("AJAY");
        } else if (n % 5 == 0) {
            System.out.println("VIJAY");
        } else if (n % 3 == 0)
            System.out.println("VISHAL");
        else {
            System.out.println("NOT DIVISIBLE BY  BOTH NUMBER ");
        }

    }
}
