package Strings;
public class CompareToString {
    public static int Tocompare(String a,String b){
        int result = a.compareTo(b);
        if(result ==0)
            System.out.println("String and b are  equal");
            else if(result<0)
            System.out.println("Smaller than b string ");
            else{
            System.out.println("greater than a string :");
        }
            return -1;
    }
    public static void main(String args[]){
        String a = "vijayyadav";
        String b = "vikrammandal";
        System.out.println(a.compareTo(b));
    }
}
