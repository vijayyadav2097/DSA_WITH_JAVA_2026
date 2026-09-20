package CyclicShorting;
import java.util.ArrayList;
public class findDuplicateElements {
     public ArrayList<Integer> findduplicate(int[] arr){
         ArrayList<Integer> ans = new ArrayList<>();
         int n = arr.length;
         int i = 0;
         while(i<arr.length){
             int rightIndex = arr[i]-1;
             if(arr[i] == i+1 || arr[rightIndex] == arr[i])i++;
             else swap(arr,i,rightIndex);
         }
         for(i = 0;i<arr.length;i++){
             if(arr[i] != i+1) ans.add(arr[i]);
         }
         return ans;
     }
     public static void swap(int[] arr, int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        findDuplicateElements obj = new findDuplicateElements();
        System.out.println(obj.findduplicate(arr));
    }
}
