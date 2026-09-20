package Stacks;

import java.util.Stack;

public class pushAtbottom {

    public static void   main(String args[]){
        Stack<Integer>  st = new Stack<>();
        st.push(10);// bottom
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);// top
          int ele = 60;
        System.out.println("before printing :"+st+" ");
        PushAtBottom(st,ele);
        System.out.println( "After printing :"+st);
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
}
