package DS07_DSA.Stacks;

import java.util.Stack;

public class displayStack {
    public static void displayRecursively(Stack<Integer> st){
        if(st.size() == 0) return;  // base case
        int top = st.pop();
        System.out.print(top + " ");    // self work
        displayRecursively(st);     // recursive work
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        // method 3: By recursively
        displayRecursively(st);


        // method 1 - by using extra stack
//        Stack<Integer> rt = new Stack<>();
//        while (st.size() > 0){
//            rt.push(st.pop());
//        }
//        while(rt.size() > 0){
//            int x = rt.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }

//        // method 2 -> by using Array
//        int n = st.size();
//        int[] arr = new int[n];
//        for(int i = n-1; i >= 0; i--){
//            int x = st.pop();
//            arr[i] = x;
//        }
//        for(int i = 0; i < n; i++){
//            System.out.print(arr[i] + " ");
//            st.push(arr[i]);
//        }

    }
}
