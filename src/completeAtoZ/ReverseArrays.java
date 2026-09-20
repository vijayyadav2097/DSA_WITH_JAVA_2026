package completeAtoZ;

public class ReverseArrays {
 public  static void main(String args[]){
     int[] arr = {34,45,67,9,56,8,56,987,56,897,67};
     int i = 0, j = arr.length-1;
     while(i<j){
         int temp  = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
         j--;
     } for(int  ele : arr ){
         System.out.print (ele+" ");
     }
 }

}
