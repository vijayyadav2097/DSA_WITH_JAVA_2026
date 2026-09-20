package completeAtoZ;

public class sumofN_naturialnumber {
    public static  int sum(int n){
        if(n == 0 || n == 1) return 1;
        return  n + sum(n-1);
    }
    public static void main(String args[]){
         int n = 60;
         int ans = n+ sum(n-1);
        System.out.println(ans+" ");

    }
}
