package completeAtoZ;
public class printElements {
    public static void printArrays(int[] arr, int index){
        if(index == arr.length) return;
        System.out.print(arr[index]+" ");
      printArrays(arr,index+1);
    }
    public static void main(String args[]){
        int[] arr ={23,34,54,67,5,7,5,78,5,67,45,67};
         printArrays(arr,0);

    }
}
