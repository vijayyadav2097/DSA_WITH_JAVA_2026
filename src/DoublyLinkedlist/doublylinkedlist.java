package DoublyLinkedlist;
 class Node{
      int val;
      Node next;
      Node prev;
       Node( int val){
           this.val = val;
       }
 }
  class DLL {
      Node head;
      Node tail;
      int size;

      void insetAthead(int val) {
          Node temp = new Node(val);
          if (head == null) head = tail = temp;
          else {
              temp.next = head;
              head.prev = temp;
              head = temp;

          }
          size++;
      }

      void InsertAttail(int val) {
          Node temp = new Node(val);
          if (head == null) head = tail = temp;
          else {
              tail.next = temp;
              temp.prev = tail;
              tail = temp;
          }
          size++;
      }

      void display() {
          Node temp = head;
          while (temp != null) {
              System.out.print(temp.val + " ");
              temp = temp.next;
          }
          System.out.println();
      }

      void displayreverse() {
          Node temp = tail;
          while (temp != null) {
              System.out.println(temp.val + "  ");
              temp = temp.prev;
          }
          System.out.println();
      }

      void deleteAtHead() {
          if (size == 0) {
              System.out.println("list is empty hai bhai!");
              return;
          }
          if (size == 1){
              head = tail = null;
          return;
      }else{
               head = head.next;
               head.prev = null;
          }
          size--;


      }
       void DeleteAtTail(){
           if( size == 0){
               System.out.println("List is empty hai bhai");
               return;
           } if( size == 1) {
                head = tail = null;
                return;
           }else{
               tail = tail.prev;
                tail.next = null;
           }
           size--;
       }
  }
public class doublylinkedlist {
     static void main(String args[]){
         DLL list = new DLL();
         list.insetAthead(23);
         list.insetAthead(20);
         list.insetAthead(30);
         list.insetAthead(40);
         list.display();
          list.DeleteAtTail();
           list.display();
            list.deleteAtHead();


     }
}
