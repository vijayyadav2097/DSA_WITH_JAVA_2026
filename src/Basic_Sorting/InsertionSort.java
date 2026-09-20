package Basic_Sorting;

public class InsertionSort {
    public static void main(String args[]){
        int [] arr = {3,4,5,34,65,45,6,4,65,65,76,67};
        for(int i = 0;i<arr.length;i++) {
            int j = i;
            while (i > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
            for(int ele: arr){
                System.out.print(ele+" ");
            }
        }

    }

