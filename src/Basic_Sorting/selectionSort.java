package Basic_Sorting;
public class selectionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] arr = {23, 5, 7, 45, 87, 54, 76, 9, 0, 56};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < arr.length - 1; i++) {
           int min = Integer.MAX_VALUE;
            int mindex = 0;
            for(int j = i;j<arr.length;j++){
                if(arr[j]< min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        print(arr);
        }
    }

