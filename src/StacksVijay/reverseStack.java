package StacksVijay;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);// magic hai bhai sahab
        st.push(top);
    }
        public static void reveseStack (Stack < Integer > st) {
         if( st.size() == 0){
             return;
         }
            int top = st.pop();
            reveseStack(st);
            pushAtBottom(st,top);
        }

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);
        System.out.println(st);
         int ele = 43;
          pushAtBottom(st,ele);
        System.out.println(st);
        reveseStack(st);
        System.out.println(st);
    }
}
