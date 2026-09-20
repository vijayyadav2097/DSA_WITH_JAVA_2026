package TwoDimensionalArrays;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String args[]){
        ArrayList <Integer> a = new ArrayList<>();
        a.add(23); a.add(54);a.add(76);a.add(345);
        ArrayList <Integer> b = new ArrayList<>();
        b.add(93); b.add(84);b.add(46);b.add(365);
        ArrayList <Integer> c = new ArrayList<>();
        c.add(983); c.add(53);c.add(75);c.add(355);
       ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
       arr.add(a); arr.add(b); arr.add(c);
       for(int i = 0;i<arr.size();i++){
           System.out.print(arr.get(i)+" ");
        }
    }

}
