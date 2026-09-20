package Basic_Sorting;

public class moveAllZero_to_end {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {23, 0, 1, 0, 0, 5, 0, 0, 45, 0, 1};
        int n = arr.length;
        print(arr);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                    j++;
                }

            }
            print(arr);
        }
    }



