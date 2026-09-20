package Arrays;
public class Rotate_Array {
    public static void main(String args[]) {
        int[] arr = {34,546,768,5,76,45,76,45,76,54,87,56};
        int n = arr.length;
        int d = 3;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
