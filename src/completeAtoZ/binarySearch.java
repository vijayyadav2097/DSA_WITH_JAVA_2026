package completeAtoZ;
public class binarySearch {
    public static void main(String args[]){
        int[] arr = {4,5,7,8,23,34,45,45,45,54,65,67,68};
        int target = 349;
        int low = 0, high = arr.length-1;
        while(low<=high){
              int mid = low+(high-low)/2;
              if(arr[mid] == target) {
                  System.out.println("index number:"+mid+" ");
                  return;
              }else if(arr[mid]>target)   high = mid-1;
              else{
                  low  = mid+1;
              }
        }
        System.out.println("not found elements:");


    }
}
