package CyclicShorting;

public class mergeSort {
    public static void main(String args[]){
        int[] arr = {23,34,65,87,23,34,5,7,956,865,467 ,456,5678,-12,-2, -10, -19};
        mergsort(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }
    public static void mergsort(int[] arr){
        int n = arr.length;  // divide two part or arrays:
        if(n == 1) return;
        int[] a = new int[n/2];
        int [] b = new int [n-n/2];
        // copy paste of arrays elements
        int index = 0;
        for(int i = 0;i<a.length;i++)
            a[i] = arr[index++];
        for(int  i = 0;i<b.length;i++)
            b[i] = arr[index++];
        // magic sorting arrays a and b
        mergsort(a);
        mergsort(b);
        merge(a,b,arr);
    }
    public static void merge(int [] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j< b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];

            }
            }
            while(i<a.length){
                c[k++] = a[i++];
            }
            while(j< b.length){
                c[k++] = b[j++];
            }
        }
    }
