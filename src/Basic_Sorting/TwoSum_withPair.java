package Basic_Sorting;
import java.util.Arrays;
public class TwoSum_withPair {
    public static boolean print(int arr[], int target) {
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    //    Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) return true;
            else if (arr[i] + arr[j] > target) j--;

            else if (arr[i] + arr[j] < target) i++;
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = { 5, 10,3,9,7,10,2};
        int target = 20;
       // print(arr);
        boolean ans = print(arr, target);
        System.out.println(ans);
    }
}
