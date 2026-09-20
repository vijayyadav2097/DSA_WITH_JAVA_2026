package completeAtoZ;
import java.util.Arrays;
public class kthsmallestNumber {
    public  static void  main(String args[]){
        int[] arr = {7, 10, 4, 3,45 ,45,67,54,20, 15};
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int k = 4;
        for(int i = 0;i<k;i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
            }
        }
            System.out.println(k + " kth smallest elements is :" + arr[k - 1]);
        }
    }

