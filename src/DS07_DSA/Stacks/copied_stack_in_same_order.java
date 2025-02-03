package DS07_DSA.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class copied_stack_in_same_order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

//        int n;
//        System.out.println("Enter the number of elements you want to insert in queue: ");
//        n = sc.nextInt();
//
//        System.out.println("Enter the elements: ");
//        for(int i = 1; i<=n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original stack: "+st);

        // stored/printing in reverse order
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());
        }
        System.out.println("reversed stack: "+rt);


        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0){
            gt.push(rt.pop());
        }
        System.out.println("copyed stack: "+gt);
    }
}
