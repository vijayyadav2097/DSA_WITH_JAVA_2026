package Recursionlevel2;

public class printsunString {
    public static void main(String args[]){
        String s ="abc";
        substring("" ,s,0);
    }
    private static void substring(String ans, String s, int index){
        if(index == s.length()){
            System.out.print(ans+" ");
            return;
        }
       char  ch = s.charAt(index);
        substring( ans+ch,s,index+1);
        substring(ans,s,index+1);

    }

}
