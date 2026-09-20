package completeAtoZ;
public class insertionsort {
    public static void  main(String args[]){
        int[] arr = {23,34,56,23,56,67,89,34,2};
        for(int i  = 0;i<arr.length;i++){
            int j = i;
            while( j>0  && arr[j]< arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
