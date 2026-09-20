package BasicRecursion;

public class checkPalindrom {
    public static  boolean  condition(String s){
        int i = 0,  j = s.length()-1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) return false;
             i++;
             j--;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "vijay";
        System.out.println(condition(s));
    }
}
