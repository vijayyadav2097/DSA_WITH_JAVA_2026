package Basic_Sorting;
public class bubble_sort {
    public static void print(int[] arr){
        int n = arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int[] arr = {3, 5, 2, 5, 7, 2, 4};
        print(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                   swap++;
                }
            }
                if(swap==0) break;
            }
                print(arr);
    }
}
