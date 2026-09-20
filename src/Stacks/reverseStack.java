package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void  main(String args[]){
        Stack<Integer> st = new Stack<>();
         st.push(12);
         st.push(13);
         st.push(14);
          st.push(15);
           int ele =16;
        System.out.println(st);
        PushAtBottom(st,ele);
        System.out.println("Adding elements :"+st);
         reverse(st);
        System.out.println("reversing  stack  is  :"+st);
    }

    private static void PushAtBottom(Stack<Integer> st, int ele) {
           if( st.size() == 0){
               st.push(ele);
               return;
           }
           int top = st.pop();
        PushAtBottom(st,ele);
         st.push(top);
    }

    private static void reverse(Stack<Integer> st) {
        if( st.size() == 1)return;
         int top = st.pop();
          reverse(st);
        PushAtBottom(st,top);

    }
}
