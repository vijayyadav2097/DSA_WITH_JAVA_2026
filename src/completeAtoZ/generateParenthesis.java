package completeAtoZ;

public class generateParenthesis {
    public static void generate(int n, String ans, int left, int right) {
        if(left == n && right == n){
            System.out.println(ans+" ");
            return;
        }
       if(left<n)  generate(n, ans + "(", left + 1, right);
    if(right<left) generate(n,ans+")",right+1,left);
    }
    public  static void main(String args[]){
        generate(1,"",0,0);
    }
}
