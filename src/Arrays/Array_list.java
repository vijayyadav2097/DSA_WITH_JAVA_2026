package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(45);
        arr.add(231);
        arr.add(65);
        arr.add(435);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
 //       System.out.println(arr.get(3));
        System.out.print(arr);
        Collections.reverse(arr);
//        System.out.println();
//        arr.set(3,1000);
//        System.out.println(arr.get(3));
//        arr.remove(2);
//        System.out.println(arr);
//        arr.contains(arr);
//        System.out.println(arr);
//
        System.out.println();
        int   n = arr.size()-1;
     for(int i = 0;i<n;i++){
         System.out.print(arr.get(i)+"  ");
     }
        }
    }

