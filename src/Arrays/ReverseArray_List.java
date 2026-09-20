package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray_List {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(34);
        arr.add(334);
        arr.add(235);
        arr.add(364);
        arr.add(3354);
        System.out.println(arr);
      //  Collections.reverse(arr);
        int i = 0 , j  = arr.size()-1;
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        i++;
        j--;
        System.out.println(arr);

    }
}
