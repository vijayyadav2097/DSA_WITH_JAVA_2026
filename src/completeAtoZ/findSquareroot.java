package completeAtoZ;

public class findSquareroot {
    public static int  squrt(int target){
        int[] arr = {2,3,5,6,76,234,556};
        int low = 0, high  =  arr.length-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(mid* mid == target)
                 return mid;
            else if(mid*mid>target) high = mid -1;
            else{
                low   =  mid +1;
            }
        }
        return high;
    }
    public static void  main(String args[]){
        int target = 25;
        System.out.println(squrt(target));
    }
}
