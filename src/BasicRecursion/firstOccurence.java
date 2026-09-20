package BasicRecursion;
import java.util.Scanner;
public class firstOccurence {
    public static int firstOccurence(int[] arr, int index, int target) {
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return firstOccurence(arr, index + 1, target);
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int[]  arr = {23,45,7,54,54,76,5,76,56,76};
        int target = sc.nextInt();
         int ans = firstOccurence(arr,0,target);
        System.out.println(ans+" ");

    }
}
