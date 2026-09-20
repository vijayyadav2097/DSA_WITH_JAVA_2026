package Basic_Sorting;
import java.util.Arrays;
public class common_elements_In_Array {
    public static void main(String args[]){
        int[] a ={23,43,65,4,6,4,7 ,6};
        int []  b = {23,45,65,3,8,98,7,6};
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0,j = 0;
        while(i<a.length && j<b.length){
            if( a[i] == b [j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if( a[i]< b[j])
                i++;
            else{
                j++;
            }
        }
    }
}
