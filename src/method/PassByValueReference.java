package method;

public class PassByValueReference {
    public static void  change(int x){
        x = 10;

    }
    public static void main(String args[]){
        int x = 8;
        System.out.println(x);
        change(24);
        System.out.println(x);
    }

}
