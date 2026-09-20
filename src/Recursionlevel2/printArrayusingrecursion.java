package Recursionlevel2;

public class printArrayusingrecursion {
    public static void recursionArrays(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index]+" ");
        recursionArrays(arr, index + 1);
    }

    public static void  main(String args[]) {
        int[] arr = {23, 44, 65, 876, 546, 76, 54, 876, 5, 76, 56, 76};
        recursionArrays(arr, 0);
    }
}