package Basic;

import java.util.Collections;

public class subsets {
    public static void subsets(String s,String ans, int index){
        if(s.length()== index){
            System.out.print(ans+" ");

            return;
        }
        char ch = s.charAt(index);
        subsets(s,ans+ch,index+1);
        subsets(s,ans,index+1);
    }
    public static void main(String args[]){
        String s = "ABC";
        subsets(s," ",0);

    }
}
