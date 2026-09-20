package Recursionlevel2;

public class LinearSearch {
    public static boolean  search(int[] arr, int target,int index){
        if(index == arr.length) return false;
  if(arr[index] == target) return true;
return search(arr,target,index+1);

    }
    public static void  main(String args[]){
       int[] arr ={34,45,76,45,87,56,87,56};
        int target = 34;
        System.out.println(search(arr,target,0));
    }
}
