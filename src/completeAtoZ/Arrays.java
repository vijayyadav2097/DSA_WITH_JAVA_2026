package completeAtoZ;

public class Arrays {
    public static boolean vijay(int[] arr,int index , int target){
        if(index == arr.length) return false;
        if(arr[index] == target) return true;
        return vijay(arr,index+1,target);

    }
    public static void main(String args[]){
        int[] arr ={324,56,4,56,45,67,56,67,4};
        int target = 354;
        System.out.println(vijay(arr,0,target));

    }
}
