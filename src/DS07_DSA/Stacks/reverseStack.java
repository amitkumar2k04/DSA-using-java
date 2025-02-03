package DS07_DSA.Stacks;

import java.util.Stack;
// reverse stack by iteratively
public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0) {
            st.push(x);   // base case
            return;
        }
        int top = st.pop();    // Pop the top element
        pushAtBottom(st, x);   // recursive work
        st.push(top);          // self work

    }
    public static void dispRecursively(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        dispRecursively(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);


        // Method 2: reverse recursively
        dispRecursively(st);
        System.out.println(st);



        // Method 1 : reverse stack by iteratively
//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//
//        Stack<Integer> at = new Stack<>();
//        while(rt.size() > 0){
//            at.push(rt.pop());
//        }
//        System.out.println(at);
//
//        while(at.size() > 0){
//            st.push(at.pop());
//        }
//        System.out.println(st);




    }
}
