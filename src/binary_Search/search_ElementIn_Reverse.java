package binary_Search;
import java.util.Scanner;
public class search_ElementIn_Reverse {
    public static int sort(int[] arr, int target) {
        int low = 0, high = arr.length - 1, idex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array elements:");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
            System.out.println("Enter  your target elements :");
            int target = sc.nextInt();
            System.out.println(sort(arr, target));
        }
    }
}
