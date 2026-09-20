package Strings;
public class SnakePrintting {
    public static void main(String args[]) {
        int[][] arr = {{36, 54, 65}, {20, 88, 58}, {34, 65, 34}};
        for(int i = 0;i<arr.length;i++){
            if(i%2==0) {
                for (int j = 0; j <= arr.length - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j = arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
