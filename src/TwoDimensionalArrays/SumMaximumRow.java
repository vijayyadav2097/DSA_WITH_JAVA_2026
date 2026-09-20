package TwoDimensionalArrays;
public class SumMaximumRow {
    static void main(String[] args) {
        int[][] arr = {{12, 84, 65}, {65, 78, 4}, {34, 87, 23}};
        int summax = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
                if (sum > summax) {
                    summax = sum;
                    row = i;
                    }
                }
             }
                System.out.println(row + " " + summax);
            }
        }


