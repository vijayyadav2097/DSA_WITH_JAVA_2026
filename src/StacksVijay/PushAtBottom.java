package StacksVijay;

import java.util.Stack;

public class PushAtBottom {
    public static  void pushAtBottom(Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
          int top = st.pop();
           pushAtBottom(st,top);
            st.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
         st.push(10);
         st.push(290);
         st.push(23);
         st.push(43);
         int ele = 1000;
        System.out.println(st);
        pushAtBottom(st,ele);
        System.out.println(st);
    }
}
