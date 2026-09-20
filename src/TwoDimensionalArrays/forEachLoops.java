package TwoDimensionalArrays;

public class forEachLoops {
    public static void main(String args[]){
        int[] [] arr = {{23,5,76,87},{34,5,76,47},{45,76,98,65}};
//        for(int  i = 0;i< arr.length; i++){
//            for(int ele: arr[i]){
//                System.out.print(ele+"  ");
//            }
//            System.out.println();
//        }
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+"  ");
            }
            System.out.println();
        }
    }
}
