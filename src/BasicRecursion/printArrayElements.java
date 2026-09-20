package BasicRecursion;
public class printArrayElements {
    public static  void print(int [] arr , int index){
        if(index == arr.length) return;
        print(arr, index+1);
        System.out.print(arr[index]+"  ");

    }
    public static void main(String args[]){
        int[] arr = {23,4,34,4,4,65,43,5};
        print(arr,0);
    }
}
