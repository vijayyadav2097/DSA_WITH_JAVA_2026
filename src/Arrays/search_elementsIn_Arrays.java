package Arrays;
import java.util.Scanner;
public class search_elementsIn_Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Arrays size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your arrays elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter your target  elements:");
        int target = sc.nextInt();
        boolean flag = false;// elements nhi hai arrays me
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true)
            System.out.println("elements exist in arrays:");
        else
            System.out.println("Not exist elements in arrays:");
    }
}
