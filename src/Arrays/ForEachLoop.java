package Arrays;
import java.util.Scanner;
public class ForEachLoop {
    public static void main(String args[]){
      int[] arr = {23,54,76,45,346,534,57,3454,4,34,65};
      for(int ele:arr){
         ele *=3;

      }
      for(int ele:arr){
          System.out.print(ele+" ");
      }
    }
}
