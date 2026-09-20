package completeAtoZ;
public class segeration1sans2s {
    public static void  main(String args[]) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1};
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
             else if  (arr[i] ==1 && arr[j] ==0){
                 arr[i] = 0;
                 arr[j] =1;
                 i++;
                 j++;
            }
        }
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
