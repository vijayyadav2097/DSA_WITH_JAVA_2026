package completeAtoZ;
  import java.util.ArrayList;
  import java.util.Collections;

public class ArraysList {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(34);
         arr.add(445);
        arr.add(23);
        arr.add(34);
        arr.add(445);
        Collections.reverse(arr);
        System.out.println(arr+" ");
    }
}
