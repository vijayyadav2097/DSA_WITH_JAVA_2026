package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalQueue {
    public static void main(String args[]){
        Queue<Integer>  q = new LinkedList<>();
        q.add(10);
         q.add(20);
          q.add(30);
          q.add(40);
          q.add(50);
        System.out.print( "Before"+ q);
    }
}
