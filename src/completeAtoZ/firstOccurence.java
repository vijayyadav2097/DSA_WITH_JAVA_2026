package completeAtoZ;
public class firstOccurence {
    public static void main(String args[]){
        int[] arr ={23,34,45,56,67,778,896};
        int target = 34;
        int index = -1;
        int low = 0, high = arr.length-1;
        while(low<= high){
            int mid = low +(high-low)/2;
            if(arr[mid] == target){
                 index = mid;
                 high = mid-1;
            }
            else if(arr[mid]> target) {
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }
        System.out.print(arr[index]+" ");
    }
}
