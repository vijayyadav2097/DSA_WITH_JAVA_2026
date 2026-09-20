package Basic;
import java.util.*;
public class Generate {
    public static void subsets(int n, String ans,int left, int right){
        if (left == n && right == n) {
            System.out.println(ans+" ");
            return;
        }
        if(left<n) subsets(n,ans+"(",left+1,right);
        if(right<left) subsets(n,ans+")",left,right+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
        subsets(n,"",0,0);

    }
}
