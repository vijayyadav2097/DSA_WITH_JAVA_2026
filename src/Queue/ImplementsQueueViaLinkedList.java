package Queue;
 class Node {
     int val;
     Node next;

     Node(int val) {
         this.val = val;
     }
 }

 class MyQueue {
         Node head;
         Node tail;
         int size;
          void display(){
               Node temp = head;
                while( temp != null){
                    System.out.print(temp.val+" ");
                     temp = temp.next;
                }
              System.out.println();
          }

     public void add(int value) {
               Node temp = new  Node(value);
                  if( size == 0) head = tail = temp;
                  else{
                      tail.next = temp;
                      tail = temp;
                  }
                   size++;
     }

     public int remove() {
               if( size == 0){
                   System.out.println("  your Queue is empty !");
                    return -1;
               }
               int front = head.val;
                head = head.next;
                 size--;
                 return  front;
     }

     public int  peek() {
         if( size == 0){
             System.out.println("  your Queue is empty !");
             return -1;
         }
         int front = head.val;
         head = head.next;
         size--;
         return  front;
     }

     }

public class ImplementsQueueViaLinkedList {
     public static void main(String args[]){
         MyQueue  q = new MyQueue();
          q.add(23);
          q.add(20);
           q.add(40);
            q.add(60);
             q.add(99);
              q.add(200);
               q.add(43);
             q.display();
         // System.out.println(q.remove());
         System.out.println(q.peek());
     }
}
