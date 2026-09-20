package Stacks;
class Node {
    int val;
    Node next;

  Node(int val) {
        this.val = val;
    }
}
     class MyStack{
         Node head;
         int  size;
        int  peek(){ // get first element hota  hai hai peek ka matlab.
               if( head == null){
                   System.out.println("Stack is empty ");
                   return -1;
               }
               return head.val;
         }
         void dispaly(){ // dispaly the Stack of the list :
              Node temp = head;
              while( temp != null){
                  System.out.print(temp.val+" ");
                   temp = temp.next;
              }
             System.out.println();
         }

         public void push(int  val) {// push ka matlab hota hai add karna hota hai Stack me :
              Node temp = new Node(val);
               if(head == null)  head = temp;
               else{
                   temp.next = head;
                   head = temp;

               }
               size++;
         }
         int pop(){ // delete karna  hota   hai pop ka matlab
            if( head == null){
                System.out.println("Empty hai Stack listb :");
                return -1;
            }
             int x = head.val;
              head = head.next;
              size--;
              return x;

         }
     }

public class LLImplementattionOfStack {
    public static void main(String  args[]){
        MyStack st = new MyStack();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
         st.dispaly();
         st.pop();
         st.dispaly();
         st.push(23);
         st.push(12);
         st.dispaly();
        System.out.println("length is that :"+st.size);

    }

}
