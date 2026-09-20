package Basic_Sorting;

public class kth_elements {
    public static void main(String args[]) {
        int[] arr = {23, 4, 5, 3, 2, 452, 54, 3};
        int k = 4;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
            for (int ele : arr) {
                System.out.print(ele +" ");
            }
            System.out.println();
        }
    }
}
