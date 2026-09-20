package TwoDimensionalArrays;
// not get result  not find result i don't have any idea to solve this problem ?
public class rotate90degree {
    public static void main(String args[]) {
        int[][] arr = {{12, 43, 65}, {45, 67, 89}, {23, 34, 65}};
        int n = arr.length;
        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }

            for (int[] a : arr) {
                for (int ele : a) {
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
        }
    }
}
