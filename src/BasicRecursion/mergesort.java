package BasicRecursion;
public class mergesort {
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if( n == 1) return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int index = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[index++];
        for(int i  = 0; i< b.length;i++)
            b[i] = arr[index++];
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i  = 0,j  = 0,k  =0;
        while(i<a.length && j< b.length){
            if(a[i] < b[j])
                c[k++] = a[i++];
            else c[k++] = b [j++];
        }
        while( i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void main(String args[]){
         int[]  arr = {23,34,523,54,3,65,7,45,76,45,544,3,876,45,87,-9,-56,-765,67};
       mergesort(arr);
       for(int  ele : arr) {
           System.out.print(ele + " ");
       }
    }
}
