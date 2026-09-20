package Arrays;
import java.util.Arrays;
public class sortBuiltenMethod {
    public static void  main(String args[]) {
        int[] arr = {23, 54, 76, 45, 7, 45, 76, 45};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
        public static void print (int[] arr){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

