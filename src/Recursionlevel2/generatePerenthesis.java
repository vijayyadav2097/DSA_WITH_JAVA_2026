package Recursionlevel2;
import java.util.ArrayList;
import java.util.List;
public class generatePerenthesis {
    public static void generate(int n,int left,int right,String s,List<String> ans){
        if(right == n){
            ans.add(s);
            return ;
        }
        if(left< n) generate(n,left+1,right,s+"(",ans);
        if(right< left) generate(n,left,right+1,s+")",ans);
    }
    public List<String> generateparenthesis(int n){
        List<String> ans = new ArrayList<>();
        generate(n,0,0,"",ans);
        System.out.print(ans+" ");
        return ans;
    }
        public static void main(String args[]){
            generatePerenthesis obj = new generatePerenthesis();
            obj.generateparenthesis(5);
        }

    }
