package BasicRecursion;
import java.util.Scanner;
public class binarySearch {
    public static  int   binarysearch(int[] arr, int low , int  high, int  target){
        if(low> high) {
            return -1;
        }
        int mid = low +( high  - low)/2;
        if (arr[mid] == target){
            return mid;
        }
       if( arr[mid]< target) {
           return binarysearch(arr, mid+1, high, target);
       }
     return binarysearch(arr, low,mid-1,target);
    }
    public static void main(String args[]){
         int[] arr = {23,34,45,56,78,89,90};
        Scanner sc   = new Scanner(System.in);
        System.out.println("Enter your target");
        int target = sc.nextInt();
        int ans = binarysearch(arr,0,arr.length-1,target);
        System.out.println(ans+" ");
    }
}
