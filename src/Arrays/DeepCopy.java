package Arrays;
import java.util.Arrays;
public class DeepCopy {
    public static void main(String args[]){
        int [] arr = {34,65,45,54,5,34,654,34,64};
        int[] y = Arrays.copyOf(arr,arr.length);
        y[4] = 399;
        System.out.println(arr[4]);
        System.out.println(y[4]);
    }
}
