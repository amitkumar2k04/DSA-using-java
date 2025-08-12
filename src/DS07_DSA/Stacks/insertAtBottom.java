package DS07_DSA.Stacks;

import java.util.Stack;
// practice
public class insertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(1);
        st.push(4);
        st.push(3);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()> 0){
            rt.push(st.pop());
        }
        st.push(6);
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
