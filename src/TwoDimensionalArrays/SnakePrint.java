package TwoDimensionalArrays;
public class SnakePrint {
    public static void main(String args[]){
        int[] [] arr = {{32,46,67},{65,87,34},{43,65,34},{34,65,87}};
        for(int i = 0;i<arr.length;i++){
            if( i % 2 == 0){
                for(int j = 0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else {
                for(int j = arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
