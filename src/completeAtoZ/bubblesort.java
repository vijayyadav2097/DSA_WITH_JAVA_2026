package completeAtoZ;

public class bubblesort {
    public static void main(String args[]){
        int [] arr ={34,4,56,7,45,7,45,7,45,8,8,76,7,56,87,5};
         for(int  i = 0;i<arr.length;i++) {
             for (int j = 0; j < arr.length - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }
             for(int ele: arr){
                 System.out.print(ele+" ");
             }
         }
    }

