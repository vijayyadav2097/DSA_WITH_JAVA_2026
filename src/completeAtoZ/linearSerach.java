package completeAtoZ;
import java.util.Scanner;
public class linearSerach {
    public static  boolean  linear(int[] arr, int target, int index){
        if(index == arr.length) return false;
        if(arr[index] == target) return true;
        return linear(arr,target,  index+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target number :");
        int target = sc.nextInt();
        int[] arr ={23,34,45,56,67,56,67,78,67,8,56};

        boolean vijay = linear(arr,target,0);
        System.out.println(vijay+" ");
    }
}
