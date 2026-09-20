package Arrays;

public class LinearSearch {
    public static void main(String args[]){
            int[] arr = {23,43,5,23,54,3,3,54,65};
            int target = 454;
            boolean flag = false;// flag means elements arrays me nhi hai
            for(int  i = 1;i<arr.length;i++){
                if(arr[i] == target) {
                    flag = true; // elements arrya me hai
                    break;
                }
            }
            if(flag){
                System.out.println("Elements exist in Arrays");
            }else{
                System.out.println("Not exist elements in arrays");
            }
       }
}
