package completeAtoZ;

import java.util.Arrays;

public class waveArrays {
    public static void main(String args[]){
         int[] arr = {34,45,67,8,45,67,45,87,5,76,45,8,67};
        Arrays.sort(arr);
         for(int i = 0;i<arr.length-1;i+=2){
             int temp =    arr[i];
             arr[i]  = arr[i+1];
             arr[i+1] = temp;
         }
         for(int ele : arr){
             System.out.print(ele+" ");
         }
    }

}
