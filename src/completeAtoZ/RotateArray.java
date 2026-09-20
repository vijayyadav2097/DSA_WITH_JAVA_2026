package completeAtoZ;

public class RotateArray {
    public static void main(String args[]){
        int[] arr = {34,546,768,5,76,45,76,45,76,54,87,56};
        int n = arr.length-1;
        int d  = 3;//5 76 45 76 45 76 54 87 56 34 546 768
        reverse(arr,0,d-1);
        reverse(arr,d,n);
        reverse(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr,int i  ,int j){
       while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
//        for(int ele : arr){ //
//            System.out.print(ele+" ");
//        }
    }

}
