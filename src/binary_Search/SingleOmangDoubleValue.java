package binary_Search;

public class SingleOmangDoubleValue {
    public static int findOnce(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) return arr[mid];
            int first = mid, Second = mid;
            if (arr[mid - 1] == arr[mid])
                first = mid - 1;
            else
                Second = mid + 1;
            int leftcount = first - low;
            int rightcount = high - Second;
            if (leftcount % 2 == 0)
                low = Second + 1;
            else
                high = first + 1;

        }
        return 0;
    }
    public static void main(String args[]){
int [] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,9,9,19,19};
        System.out.println(findOnce(arr));
    }
}
