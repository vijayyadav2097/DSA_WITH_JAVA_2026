package Queue.RevisionQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
     public static void main(String args[]){
         Queue<Integer> q = new LinkedList<>();
          q.add(23);
          q.add(23);
          q.add(43);
         q.add(23);
         System.out.println("Before elements iin a queue:");
         System.out.println(q+" ");
          Stack<Integer> st = new Stack<>();
           while(q.size()>0){
               st.push(q.remove());
           }
            while(st.size()>0){
                q.add(st.pop());
            }
         System.out.println("After elements in a queue");
         System.out.println(q+" ");
     }
}
