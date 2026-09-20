package completeAtoZ;

public class binaryRecursion {
    public static int helper(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return helper(arr, target, low, mid - 1);
        else return helper(arr, target, mid + 1, high);
    }
    static int search(int[] arr, int target) {
        int n = arr.length;
        return helper(arr, target, 0, n - 1);
    }
    public static void main(String args[]){
        int[] arr  ={23,45,67,78,678,4576};
        int target = 6728;
        System.out.println(helper(arr,target,0,arr.length-1));
    }
}
