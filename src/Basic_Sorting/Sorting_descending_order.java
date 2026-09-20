package Basic_Sorting;

public class Sorting_descending_order {
    public static void print(int[] arr){
        for(int  ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void  main(String args[]){
        int[] arr = {32,665,45,34,56,34,546,65};
        int n = arr.length;
        print(arr);
        for(int i = 0;i<arr.length-1;i++){
            int swap  = 0;
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
            }
            if(swap == 0)
                break;
        }
        print(arr);
    }
}
