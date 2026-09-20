package Strings;

public class passingStringToMethod {
    public static void change(int  x){
        x = 10;
    }
    public static void main(String args[]){
        int x = 10;
        change(20);
        System.out.println(x);


    }
}
