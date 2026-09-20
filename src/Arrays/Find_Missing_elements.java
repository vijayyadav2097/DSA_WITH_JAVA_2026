package Arrays;
import java.util.Scanner;
public class Find_Missing_elements {
    public static void main(String args[]) {
        int[]arr = {3,4,2,1};
        int n= 5;
            int sum = n * (n + 1) / 2;
            int Arraysum = 0;
//            for (int ele : arr) {
//                Arraysum += ele;
//            }
        for(int i =0;i<arr.length;i++){
            Arraysum += arr[i];
        }
            int missing = (sum - Arraysum);
            System.out.println("Your missing elements is:" + missing + " ");
        }
    }

