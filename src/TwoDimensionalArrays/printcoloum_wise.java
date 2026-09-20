package TwoDimensionalArrays;
public class printcoloum_wise {
    public static void main(String args[]) {
        int[][] arr = {{36, 54, 65}, {20, 88, 58}, {34, 65, 34}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}   
















