package completeAtoZ;

import javax.naming.InsufficientResourcesException;

public class findSecondmaximum {
    public static void main(String args[]){
        int[] arr ={23,435,56,78,5,78,67,8,67,8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
           for(int i  = 0;i<arr.length;i++){
               if(arr[i] > max) {
                       max = arr[i];
                   }
               }
             for(int i  = 0;i<arr.length;i++){
                 if(arr[i]>smax && max!=arr[i])
                     smax = arr[i];
             }
        System.out.println(smax+" ");
    }
}
