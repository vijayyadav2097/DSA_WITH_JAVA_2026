package completeAtoZ;

public class mergetwoShortedArrays {
    public static void merge(int[] a, int[] b, int[] c){
        int i  = 0,j  = 0 , k  = 0;
//      i = a.length;
//      j = b.length;
        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                c[k++] = a[i++];
            else c[k++] = b [j++];
         }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public  static void  main(String args[]){
        int[] a = {34,45,56,78,89};
                int[] b = {34,45,78,456,789,4567};
        int[] c = new int[a.length+b.length];
        for( int ele :c){
            System.out.print(ele+" ");

        }
        System.out.println();
        merge(a,b,c);
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
