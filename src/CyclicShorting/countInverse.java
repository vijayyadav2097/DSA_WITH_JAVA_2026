package CyclicShorting;

public class countInverse {
    public static int countInverse(int[] arr){
        int vijay = 0;
        for(int i  = 0;i<arr.length;i++){
            for(int  j = i+1;j<arr.length;j++){
                if(arr[i]> arr[j]) vijay++;
            }
        }
        return vijay;
    }
    public static void main(String args[]){
        int[] arr = {2, 4, 1,7,2,1,3};
        System.out.println("Your count inverse is : "+ countInverse(arr));

    }
}
