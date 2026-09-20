package binary_Search;

public class firstOccurence_BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] > target)
                high = mid - 1;
            else {
                index = mid;
                high = mid - 1;
            }
        }
            return index;
        }
   public static void main(String  args[]){
       int[] arr = {2,2,4,5,6,6,6,7,56,76,65};
       int target = 6;
      int result = binarySearch(arr,target);
       System.out.print("Index :"+result);
   }
    }
