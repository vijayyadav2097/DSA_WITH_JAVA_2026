package Basic;

public class mergeSortedArrays {
    public static void mergesort(int[] arr) {
        int n = arr.length;
        if( n == 1) return ;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[index++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[index++];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }
        public static void merge(int[] a, int[] b, int[] c){
           int i  = 0, j = 0,k = 0;
           while(i<a.length && j<b.length) {
               if (a[i] < b[j]) c[k++] = a[i++];
               else {
                   c[k++] = b[j++];
               }
           }
               while(i<a.length) c[k++] = a[i++];
               while(j<b.length) c[k++] = b[j++];
        }
    public static void main(String args[]){
        int[] arr = {23,435,23,4,4,3,5,4,65,34,5,43,6,3,5,6};
        mergesort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
