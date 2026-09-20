package completeAtoZ;

import java.util.ArrayList;
import java.util.List;

public class subsetPower {
    public static void subsets(String ans,String s,int index, List<String> list){
        if(index == s.length()){
       //  if(ans.length() !=0)
             list.add(ans);
        return;
        }
        char  ch = s.charAt(index);
        subsets(ch+ans,s,index+1,list); // peak
        subsets(ans,s,index+1,list);// skip

    }
    public static void main(String args[]){
        String s = "ABC";
        List<String> list = new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);

    }
}
