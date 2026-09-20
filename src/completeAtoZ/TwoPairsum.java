package completeAtoZ;

public class TwoPairsum {
    public static  boolean twosum(int[] arr , int target){
        for(int i  = 0 ;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return true;
            }
        }
            return false;
        }
    public static void main(String args[]){
        int[] arr = {34,45,67,989,5,78,90,45,567,89};
        int target = 190;
     boolean ans = twosum(arr,target);
        System.out.println(ans+" ");

    }
}
