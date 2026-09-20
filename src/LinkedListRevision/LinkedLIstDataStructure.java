package LinkedListRevision;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
       }
  }
     class Linkedlist{
        Node head;
        Node tail;
        int size;
        void AddAtTail(int val){
             Node temp = new Node(val);
             if( tail == null)   head = tail = temp;
             else{
                 tail.next = temp;
                 tail = temp;

             }
            size++;
        }
        int  get(int index){
             Node temp = head;
              for( int i  = 1;i<index;i++){
                  temp = temp.next;
             }
              return temp.val;

        }
          void display() {
            if( head == null) return;
             Node temp = head;
             while( temp != null){
                 System.out.print(temp.val+" ");
                 temp = temp.next;
             }
              System.out.println();
         }
          void AddAtHead(int val) {
              Node temp = new Node(val);
            if( head == null) head = tail = temp;
            else {
                temp.next = head;
                head = temp;
            }
              size++;
         }
          void DeleteAtHead(){
            if( head ==  null){
                System.out.println("List is empty");
            }
            head = head.next;
            if( head == null) tail = null;
            size--;
          }
            boolean search(int value){
             if( head == null) return false;
             Node temp = head;
             while(temp != head){
                if( temp .val == value) return true;
            temp =  temp.next;
             }
             return false;
            }
         void InsertAtIndex(int value, int index) {
            if( index < 0 || index>size) System.out.println("Invalid index");
            else if( index == 0) AddAtHead(value);
            else if( index == size ) AddAtTail(value);
            else{
                Node temp = head;
                for( int  i = 1; i<=index-1;i++){
                     temp = temp.next;
                }
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
         }
          void DeleteAtIndex(int index) {
            Node  temp = head;
            for(int i = 1 ; i<=index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
         }
     }
public class LinkedLIstDataStructure {// user defined data type
    public static void main(String args[]) {
        Linkedlist ll = new Linkedlist();
        ll.AddAtTail(10);
        ll.AddAtTail(34);
        ll.AddAtTail(100); ll.display();
        ll.AddAtHead(45);
        ll.AddAtHead(785); ll.display();
         ll.DeleteAtHead();   ll.display();
        System.out.println(ll.size+" ");
        ll.search(100); ll.display();
        ll.InsertAtIndex(3004,2); ll.display();
        System.out.println(ll.get(3));
        ll.DeleteAtIndex(3);  ll.display(); // 45 10 3004 100
         }
    }

