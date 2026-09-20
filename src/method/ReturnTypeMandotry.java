package method;

public class ReturnTypeMandotry {
    public static int vijay(int a){
        if(a<10){
            return a;
        }else{
            return 20;
        }
    }
    public static void main(String args[]){
        System.out.println((vijay(3)));
        System.out.println(vijay(32));
    }
}
