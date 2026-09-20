package LinkedListRevision;

 class linkedlist{
     Node head;
     Node tail;
     void add(int val){
         Node temp = new Node(val);
         if(head == null){
             head = tail = temp;
         }else{
             tail.next = temp;
             tail = temp;
         }
     }
        void print(){
         Node  temp = head;
         while(temp!= null){
             System.out.print(temp.val+"  ");
             temp = temp.next;
         }
            System.out.println();
        }
         int middleElement(){
              Node slow = head;
              Node fast = head;
              while(fast != null && fast.next != null){
                  slow = slow.next;
                  fast = fast.next.next;
              }
              return slow.val;
         }
 }
public class middleofaLinkedlist {
     public static  void main(String args[]){
         linkedlist ll = new linkedlist();
         ll.add(45);
         ll.add(46);
         ll.add(50);
         System.out.println("linked list :");
         ll.print();
         int  middle = ll.middleElement();
         System.out.println("Middle elements is :" + middle);
     }
}
