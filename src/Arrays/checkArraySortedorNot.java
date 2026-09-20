package Arrays;

public class checkArraySortedorNot {
    public static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
            return true;
        }
     public static void  main(String args[]){
        int [] arr = {23,54,65,34,6,34,6,34,65};
        sorted(arr);
     }
    }



