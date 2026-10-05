package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementationOfQueue {
    private  static  void display(Queue<Integer> q){
         int n  = q.size();
          for( int i = 0;i<n;i++){
              System.out.print(q.peek()+" ");
               q.add(q.remove());
          }
        System.out.println();

     }
    private static void AddAtIndex( Queue<Integer> q  ,int index, int  value) {
         int n =  q.size();
          for( int i = 1;i<=index;i++){
               q.add(q.remove());
          }
           q.add(value);
           for( int i = 1;i<=n-index;i++){
               q.add(q.remove());
           }
    }
      public static  void  peek(Queue<Integer> q,int index){
        int n = q.size();
          for( int i = 1;i< index-1;i++){
               q.add(q.remove());
          }
          q.peek();
          System.out.println(q.peek());
      }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
         q.add(10);
          q.add(20);
           q.add(30);
            q.add(40);
          display(q);
           AddAtIndex( q,2,344);
            display(q);
             peek(q,2);



    }

}
