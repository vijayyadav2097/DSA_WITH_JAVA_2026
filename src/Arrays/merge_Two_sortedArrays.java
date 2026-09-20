package Arrays;
public class merge_Two_sortedArrays {
    public static void main(String args[]) {
        int[] a = {1, 3, 5, 6, 8};
        int[] b = {2, 4, 7, 9, 10, 11, 12, 13};
        int[] c = new int[a.length + b.length];
        for (int ele : c)
            System.out.print(ele+" ");
        System.out.println();
            merge(c, a, b);
        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;//
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        // k++;
            while (i < a.length)
                c[k++] = a[i++];
            while (j < b.length)
                c[k++] = b[j++];
        }
    }


