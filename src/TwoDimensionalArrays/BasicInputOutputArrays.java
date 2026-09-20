package TwoDimensionalArrays;

public class BasicInputOutputArrays {
    public static void main(String args[]){
         // int [] []  arr = new int[3][4];
        int [] []  arr = {{23,43,65} ,{23,54,76},{87,98,45}};
        for(int i = 0;i<arr.length ;i++){
            for(int j = 0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
