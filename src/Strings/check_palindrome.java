package Strings;
public class check_palindrome {
    public static boolean check(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
                i++;
                j--;
            }
        return true;
    }
    public static void main(String args[]){
         String s = "mom";
        System.out.println(check(s));
    }
}
