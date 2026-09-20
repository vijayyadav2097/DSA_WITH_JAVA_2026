package binary_Search;
public class Searching_elements {
    public static  void main(String args[]){
        int[] arr = {23,54,76,98,3465,76879};
        int  target = 98;
        int  n =  arr.length-1;
        int low = 0,high = n;
        while(low<= high) {
            int mid = low+( high -low) / 2;
            if (arr[mid] == target){
                System.out.print("The element in index  Number :"+mid);
                return;
            }else if (arr[mid] > target)
               high = mid-1;
            else{
             low = mid+1;
            }
        }
        System.out.println("not exist in arrays");
    }
}
