package Arrays;

public class ShallowCopy {
    public static void main(String args[]){
        int[] vijay = {23,54,65,786,34,65,876,34,76,45,76,45};
        int[] y = vijay;
        y[4] = 2000;
        System.out.println(vijay[4]);
    }
}
