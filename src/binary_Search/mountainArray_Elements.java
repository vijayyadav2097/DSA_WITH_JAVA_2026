package binary_Search;
public class mountainArray_Elements {
    public static  int mountain(int[] arr){
        int low = 1,high = arr.length-2;
        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            else if (arr[mid]> arr[mid-1] && arr[mid] < arr[mid+1])
                low = mid+1;
            else
                 high= mid-1;
        }
        return 2345;
    }
    public static  void  main(String args[]){
        int[] arr = {1  ,3 ,5 , 7 , 6  ,4,  2};
        System.out.println(mountain(arr));
    }
}
