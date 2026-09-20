package Recursion;
public class GlobalVariable {
    static int x = 12;
    public static void main(String args[]){
        print();
        x = 23;
        System.out.println(x);
    }
    public static void print(){
        System.out.println(x);
    }
}
