package Recursionlevel2;

public class printSubsets {
    public static void main(String args[]){
        String s =  "abc";
        subset("" ,s,0);
    }
    public static void subset(String ans, String s,int index){
        if(index == s.length()){
            System.out.print(ans+"  ");
            return;
        }
        char ch = s.charAt(index);
        subset(ans+ch,s,index+1);
        subset(ans ,s,index+1);
    }
}
