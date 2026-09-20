package Stacks;

import java.util.Stack;

public class BasicOprtation {
     public static void main(String  args[]){
         Stack<String > st = new Stack<>();
         System.out.println(st.isEmpty());// true
          st.push("Vijay");
           st.push("ajay");
            st.push("kalu");
             st.push("abhishek");
         System.out.println(st);
         System.out.println("Your stack length   is that : "+st.size());//4
          st.pop();
         System.out.println(st);
         System.out.println("Your stack length  is  that : "+st.size());//3
         System.out.println(st.isEmpty());// false
         System.out.println(st.peek());

     }
}
