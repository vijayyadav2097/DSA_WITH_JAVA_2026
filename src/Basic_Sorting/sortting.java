package Basic_Sorting;

public class sortting {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {23, 5, 76, 34, 65, 347, 845, 9};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < arr.length - 1; i++) {
//            boolean isSorted = true;
//            for(int j = 0;j<arr.length-1;j++) {
//                if (arr[j] > arr[j + 1]) {
//                    isSorted = false;
//                    break;
//                }
//
//            }
//            if(isSorted== true) break;
            int swaps = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
                print(arr);
            }

}
