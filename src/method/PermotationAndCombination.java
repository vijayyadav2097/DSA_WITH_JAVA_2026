package method;
import java.util.Scanner;
public class PermotationAndCombination {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your n value:");
        int n = sc.nextInt();
        System.out.println("Enter your r value");
        int r = sc.nextInt();
        int nFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact *= i;
        }
        int rFact = 1;
        for (int i = 1; i <= r; i++) {
            rFact *= i;
        }
        int nrFact = 1;
        for (int i = 1; i <= n - r; i++) {
            nrFact *= i;
        }
        int ncr = nFact/(rFact*nrFact);
        System.out.println(ncr);
    }

}
