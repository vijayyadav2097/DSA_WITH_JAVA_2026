package binary_Search;

public class Square_Root {
    public static  int square(int n){
        int low = 0,high = n;
        while(low<= high){
             int  mid = (low+high)/2;
             if(mid*mid == n)
              return mid;
             else if( mid*mid > n) high =   mid-1;
             else{
                 low = mid+1;
             }
        }
        return high;
    }
    public static void main(String args[]){
        int n = 11;
        System.out.println(square(n));
    }
}
