package Arrays;

public class muiltiply_IndexbyUSing_function {
    public static void main(String args[]) {
        int[] arr = {2, 4, 23, 3, 23, 4, 203, 2};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                arr[i] *= 2;
            else
                arr[i] += 10;
        }
        print(arr);
    }
        public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();

        }
}
