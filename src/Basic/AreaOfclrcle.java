package Basic;
import java.util.Scanner;
public class AreaOfclrcle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your radius  value  :");
        double  radius = sc.nextInt();
        double area = 3.14*radius* radius;
        System.out.println("The area of circle is:"+ area);

    }
}
