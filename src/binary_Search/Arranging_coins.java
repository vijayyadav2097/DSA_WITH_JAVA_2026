package binary_Search;

public class Arranging_coins {
    public static int Arranging(int n){
        int low =0,high = n;
        int ans = 0;
        while(low<= high){
            int k = low+ ( high-low)/2;
            int m = k *(k+1)/2;
            if(m== n)
                 return k;
            else if( m>n){
                high = k-1;
            }else{
                ans = k;
                low = k+1;
            }
        }
        return (int)(ans);
    }
    public  static void main(String args[]){

        System.out.println(Arranging(70));
    }
}
