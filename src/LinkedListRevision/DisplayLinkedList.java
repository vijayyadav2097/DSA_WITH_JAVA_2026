package LinkedListRevision;

import java.util.Scanner;

public class DisplayLinkedList {
    public static void displayRecursion(Node  head){
        if( head ==  null) return;
        displayRecursion(head.next);
        System.out.print(head.val+" ");
    }
    public static void display(  Node head){
        //  USING WHILE LOOPS
          Node vijay = head;
          while( vijay != null){
              System.out.print(vijay.val+" ");
              vijay = vijay.next; // IMPORTANT POINT HAI YE KI EK EK AGEE BADHHEGA YE VIJAY;
              // JAB TAK YR NULL NA HO JAYE TAB TAK YE AGGE HI JAEGA.
          }
        System.out.println();
        // USING FOR LOOPS
//         for(Node  temp = head; temp != null;temp= temp.next){
//             System.out.print(temp.val+" ");
//         }
//        System.out.println();
    }
    public  static int get(Node head,int index){
        Node temp  = head;
        for( int i = 1;i<=index;i++){
             temp   = temp.next;
        }
        return temp.val;
    }
         public static void main(String args[]){
            Node a = new Node(100);
             Node b = new Node(2400);
             Node  c = new Node(2500);
             Node d = new Node(2080);
             Node e = new Node(20560);
              a.next = b;b.next = c;
              c.next = d;d.next = e;
             // display(a); // DISPLAY THE NODE VALUE .
            // displayRecursion(a);
             System.out.println(get(a,4));

         }

     }

