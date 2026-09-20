package completeAtoZ;
public class reverseBinarySearch {
    public static int revese(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                high = mid - 1;
            } else low = mid + 1;
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr ={2232,333,56,26,5,3,2};
        int target = 333;
        int ans = revese(arr,target);
        System.out.println(ans+" ");
    }
}
