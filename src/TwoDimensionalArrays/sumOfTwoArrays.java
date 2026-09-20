package TwoDimensionalArrays;

public class sumOfTwoArrays {
    public static void main(String  args[]){
        int[][] arr ={{2,4,7},{7,6,5},{4,6,6}};
       int sum = 0;
       for(int i = 0;i<arr.length;i++){
           for(int j = 0;j< arr[0].length;j++){
               sum += arr[i][j];
           }
       }
        System.out.println(sum+" ");
    }
}
