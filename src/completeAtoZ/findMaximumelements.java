package completeAtoZ;

public class findMaximumelements {
     public static void main(String args[]){
         int[] arr  = {23,34,-56,34,54,-43,54,3,- 445,65};
         int max = Integer.MAX_VALUE;
         for(int i = 0;i<arr.length;i++){
             if(arr[i] < max)
                 max = arr[i];
         }
         System.out.println( "Your maximum elements is :"+max+" ");
     }
}
