package If_else_condition;
import java.util.Scanner;
public class profitAndLooscheck {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your  kharida huva price:");
        int kharida = sc.nextInt();
        System.out.println("Enter your becha huva price:");
        int becha = sc.nextInt();
        if(kharida<becha)
            System.out.println("you gain profit:"+(becha - kharida));
        if(becha<kharida)System.out.println("you gain loss:"+(kharida-becha));
        if(kharida == becha)
            System.out.println("no profit no loss");
    }

}
