package completeAtoZ;

public class printSumArrays {
    public  static void main(String args[]){
        int[] arr = {34,56,874,7,8,34,8};
        int sum = 1;
         for(int i = 0 ;i<arr.length;i++){
             sum *= arr[i];
         }
        System.out.println("the product of array elements is :"+ sum+" ");
    }
}
