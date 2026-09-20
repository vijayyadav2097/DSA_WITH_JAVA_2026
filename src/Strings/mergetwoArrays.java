package Strings;
import java.util.Scanner;
public class mergetwoArrays {
    public static void   main(String args[]) {
        int[] a = {23, 45, 56, 78, 89, 567};
        int[] b = {34, 54, 67, 89};
        int[] c = new int[a.length + b.length];
        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();
        merge(c,a,b);
        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();
    }
             public static void merge(int[] c,int[]a,int[]b){
        int i = 0,j = 0,k = 0;
        while( i< a.length && j< b.length){
            if(a[i]< b [j])
                c[k++] = a[i++];
                else
                    c[k++] = b[j++];
                }
        while(i<a.length)
            c[k++] =a[i++];
            while(j<b.length)
                c[k++] = b[j++];
            }
           }

