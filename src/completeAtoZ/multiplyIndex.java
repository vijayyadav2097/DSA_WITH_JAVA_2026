package completeAtoZ;

public class multiplyIndex {
    public static void main(String[] args){
        int [] arr = {3,5,6,7,8,9,2};
        for(int ele : arr){
            System.out.print(ele+" ");
            System.out.println();
        }
        for(int i  = 0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(2*arr[i]+" ");
            }else {
                System.out.print(10 + arr[i] + " ");
            }
        }
    }
}
