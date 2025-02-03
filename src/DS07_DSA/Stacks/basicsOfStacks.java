package DS07_DSA.Stacks;

import java.util.Stack;

public class basicsOfStacks {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty());  // return boolean
        System.out.println("size is: "+ st.size());
        System.out.println(st);
        st.push(155);
        System.out.println("size is: "+ st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("size is: "+ st.size());
        System.out.println(st);
        st.push(90);
        System.out.println("size is: "+ st.size());
        System.out.println(st);
        st.push(5);
        System.out.println("size is: "+ st.size());
        System.out.println(st);
        st.push(34);
        System.out.println("size is: "+ st.size());
        System.out.println(st);

        System.out.println(st);

        //System.out.println(st.pop());
        //System.out.println(st.peek());

        //System.out.println(st.size());

        // printing the 1st elements of stack
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());  // Note: all the elements of the stack is deleted, except 1st elements
        //System.out.println(st);

    }
}
