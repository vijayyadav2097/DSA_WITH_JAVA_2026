package CyclicShorting;
public class missingElementsusingCyclicsort {
    public static void main(String args[]) {
        int[]  arr = {2,3,5,7,8,6,4,1,11,9};
       int ans = missingNumber(arr);
        System.out.println(ans+" ");
    }
    public static int missingNumber(int[] arr) {
        int n = 1 + arr.length;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n) i++;
            else {
                int index = arr[i] - 1;
                swap(arr, i, index);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n;
    }
        public static void swap(int[] arr, int i, int index){
             int temp = arr[i];
             arr[i] = arr[index];
             arr[index] = temp;
        }
      }



