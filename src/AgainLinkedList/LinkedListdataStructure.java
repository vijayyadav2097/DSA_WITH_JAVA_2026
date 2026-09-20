package AgainLinkedList;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
    class Linkedlist {
        Node head;
        Node tail;
        int size;
             int search(int val){
                 if(head == null) return -1;
                 Node  temp = head;
                 int index = 0;
                 while(temp != null){
                     if(temp.val == val)  return index;
                      temp = temp.next;
                      index++;
                 }
                  return -1;
             }
        void addAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
         void addAttail( int val){
             Node temp = new Node(val);
             if(  head == null){
                 head = tail = temp;
             }else{
                 tail.next = temp;
                 tail = temp;
             }
                 size++;
         }
         void display() {
            Node  temp = head;
            while(temp != null){
                System.out.print(temp.val+"  ");
                temp = temp.next;
            }
             System.out.println();

        }
        void deleteAtHead() {
            Node temp = head;
            if(head == null){
                System.out.println("List is empty !");
                return;
            }
            head  = head.next;
            if( head == null) tail = null;
            size--;
        }

         int  getelements(int index) {
            Node temp = head;
            for( int   i = 0;i < index;i++){
                 temp = temp.next;
            }
            return temp.val;
        }

         void insertvalueAtIndex(int val, int index) {
                 if(index<0 || index>size){
                     System.out.println("Invalid index.....");
                 }
                  else if (index==0) addAttail(val);
                  else if(index == size) addAtHead(val);
                  else {
                      Node temp = head;
                      for(int i = 1;i<index;i++){
                           temp = temp.next;
                      }
                      Node newNode = new Node(val);
                      newNode.next = temp.next;
                      temp.next = newNode;
                     size++;
                 }
        }
         void deletevalueAtIndex(int index){
                 if( index<0 || index >= size-1){
                     System.out.println("Invalid index !");
                 }
                 else if(index == 0){
                     deleteAtHead();
                 }else{
                     Node temp = head;
                     for(int i = 1;i<index;i++){
                         temp = temp.next;
                     }
                     temp.next = temp.next.next;// this  line  is deleting node !
                     if(index == size-1)  tail = temp;
                     size--;
                 }
         }
           int  deletemiddleNode(){
                 if(head == null || head.next == null){
                     return -1;
                 }
                 Node slow = head;
                 Node  fast = head;
                 Node prev = null;
                 while(fast != null && fast.next != null){
                      prev  = slow;
                      slow = slow.next;
                      fast = fast.next;
                 }
                 prev.next = slow.next;
                 return head.val;
          }
    }
    public class LinkedListdataStructure {
        public static void main(String args[]) {
            Linkedlist ll = new Linkedlist();
            ll.addAtHead(23);
            ll.addAtHead(13);
            ll.addAtHead(23);         ll.display();
             ll.addAttail(100);
             ll.addAttail(200);        ll.display();
             ll.deleteAtHead();            ll.display();
            System.out.println(ll.size);
             ll.display();

//            System.out.println(ll.getelements(3));
//             ll.search(100);
//             ll.display();
            ll.insertvalueAtIndex(232,2);
            ll.display();
            System.out.println(ll.size);
           // System.out.println("2nd indexElements is :"+ll.getelements(2));
            ll.deletevalueAtIndex(22);
            ll.display();
            ll.deletemiddleNode();
            ll.display();


        }
    }

