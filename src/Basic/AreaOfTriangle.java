package Basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lemgth :");
        double length = sc.nextInt();
        System.out.println("Enter your breadth :");
        double breadth = sc.nextInt();
        double area =  (length * breadth)/2;
        System.out.println("Area of triangle is : " + area);
    }
}


