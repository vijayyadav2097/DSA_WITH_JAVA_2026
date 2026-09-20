package AgainLinkedList;

import org.w3c.dom.ls.LSOutput;

//class Node{
//        int val;
//        Node  next;
//        Node(int val){
//            this.val = val;
//        }
//
//    }
public class NodeLinkedList {
       public static void  main(String args[]){
           Node n1 = new Node(12);
           Node n2 = new Node(34);
           Node n3 = new Node(54);
           Node n4  = new Node(543);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
           System.out.println(n2.next.val);
       }



}
