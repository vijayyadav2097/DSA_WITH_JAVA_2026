package LinkedList;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;
    void addAtHead(int value) {
        Node temp = new Node(value);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAttail(int value) {
        Node temp = new Node(value);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void delete(){
        if(head == null){
            System.out.println("Empty  node");
            return;
        }
        head = head.next;
        if( head == null) {
            tail = null;
        }
        size--;
    }
    void Display(){
        if(head == null) return;
        Node  temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();

    }
    void insertValueAtIndex(int index, int value) {
        if( index<0 || index>size) System.out.println("Invailed Index");
        else if( index == 0) addAtHead(value);
        else if ( index == size) addAttail(value);
        else{
            Node temp = head;
            for( int i = 1;i<=index-1;i++){
                temp = temp.next;
            }
            Node t = new Node(value);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    int get(int index) {
          Node temp = head;
          for( int i  = 1;i<=index;i++){
              temp = temp.next;
          }
          return temp.value;
    }
    int  search(int value) {
        if( head == null) return -1;
        Node temp = head;
        int index = 0;
        while( temp != head){
            if(temp.value == value) return index;
            index++;
        }
        return -1;
    }

    void deleteValueAtIndex(int index) {
        if( index<0 || index>size){
            System.out.println("Invailed index");
            return;
        }
        if( index == 0){
            deleteAtHead();
            return;
        }
        Node temp  = head;
         for( int i = 1;i<index-1;i++){
             temp = temp.next;
         }
          temp.next = temp.next.next; // delete
         if( index == size-1) tail = temp ;  // we are deleting tail
        size--;
    }

    void deleteAtHead() {
        if( head == null){
            System.out.println("Empty Node");// 120 452 50
            return;
        }
        head = head.next;
        if(head ==null){
            tail = null;
        }
        size--;
    }
}
public class LinkedListDataStructure {
    public  static void main(String args[]){
        Linkedlist ll =  new Linkedlist();
         ll.addAttail(120);
        ll.addAttail(50);
         ll.Display();
        ll.addAtHead(100);
        ll.addAtHead(1000);
      ll.Display();
        ll.delete();
        ll.Display();
        System.out.println(ll.size);
        ll. insertValueAtIndex(2,452);
        ll. insertValueAtIndex(3,4502);
        ll.Display();
       System.out.println(ll.get(2));
       ll.deleteValueAtIndex(4);
       ll.Display();
        System.out.println(ll.search(456));
        ll.deleteAtHead();
        ll.Display();
        ll.deleteValueAtIndex(2);
        ll.Display();
    }
}
