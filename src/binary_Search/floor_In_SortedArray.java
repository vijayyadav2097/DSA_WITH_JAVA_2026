package binary_Search;

public class floor_In_SortedArray {
    public static  int floorArray(int[] arr, int target) {
        int low = 0, high = arr.length - 1, index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) high = mid - 1;
            else {
                index = mid;
                low = mid +1;
            }
        }
            return index;
        }
    public static void  main(String args[]){
        int []  arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 11;
        System.out.println(floorArray(arr,target));
    }
}
