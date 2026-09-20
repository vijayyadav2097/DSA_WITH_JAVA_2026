package completeAtoZ;

import java.util.Arrays;

public class Arrayssort {
    public static void main(String args[]){
        int[]  arr = {34,65,76,45,76,45,76,45,7,5,456,45,7};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
