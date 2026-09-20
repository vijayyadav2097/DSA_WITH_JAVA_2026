package TwoDimensionalArrays;
public class TransposeMatrix {
    public static void main(String args[]) {
        int[][] arr = {{23, 34, 65}, {67, 87, 45}, {76, 75, 45}};
       // print(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }

    public static void print(int[] [] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    }

