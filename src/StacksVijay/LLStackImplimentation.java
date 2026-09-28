package StacksVijay;
 class Node {
     int val;
     Node next;

      Node(int val) {
         this.val = val;
     }
 }
     class MeraStackHai{
         Node head;
         int length;
          int peek(){
              if( head == null){
                  System.out.println("Stack empty hai bhai!");
                  return -1;
              }
              return  head.val;
          }
            int pop(){
               if( head == null){
                   System.out.println("Stack khali hai bhai");
                   return -1;
               }else{
                    int x = head.val;
                   head  = head.next;
                   length--;
                   return  x;
               }
     }
       void push(int val){
               Node temp = new Node(val);
                if(length==0) head =  temp;
                else{
                    temp .next = head;
                     head = temp;
                }
                length++;
          }
          int size(){
              return length;
          }

         public void display() {
              Node temp = head;
              while( temp!= null){
                  System.out.println(temp.val);
                  temp = temp.next;
              }
             System.out.println();
         }
     }
public class LLStackImplimentation {
     public static void  main(String args[]){
         MeraStackHai  st = new  MeraStackHai();
          st.pop();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         st.push(50);
         st.display();
         System.out.println(st.length);
         st.pop();
         st.display();
     }
}
