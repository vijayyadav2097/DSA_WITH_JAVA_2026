package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class commonElementinTwoArray {
    public ArrayList<Integer> commonelements (int[] arr ,int [] a, int [] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) i++;
            else j++;
        }
            return ans;
        }
    public static void main(String[] args) {

        int[] a = {23, 34, 56, 67, 8, 34};
        int[] b = {45, 78, 56, 87, 34};

        Arrays.sort(a);
        Arrays.sort(b);

        commonElementinTwoArray obj = new commonElementinTwoArray();

        ArrayList<Integer> result = obj.commonelements( a,a, b);

        System.out.println("Common Elements: " + result);
    }
}
