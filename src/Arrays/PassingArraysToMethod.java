package Arrays;

public class PassingArraysToMethod {
    public static void main(String args[]){
        int[] x = {12,3,54,65,76,34,65,34,65,75};
        System.out.println(x[5]);
        change(x);
        System.out.println(x[5]);
    }
    public static void change(int[] z){
        z[5] = 1000;
    }
}
