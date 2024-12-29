package J29_Java.Collection_Framework;

import java.util.LinkedList;
import java.util.Stack;

public class ListInterfaceExamples {
    static void ArrayListExamples(){
        //ArrayList<Integer> l = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); //1 2 3
        System.out.println(l.get(1)); // 1-based indexing => 2
        l.set(1, 10);  // modify at index i
        System.out.println(l); // 1, 10, 3
        System.out.println(l.contains(10)); // true
    }
    static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.pop()); // skills // read top element and also remove it.
        System.out.println(st.peek()); // pw
        System.out.println(st.size()); // 1
        System.out.println(st.empty()); // false

    }

    public static void main(String[] args) {
        //ArrayListExamples();
        StackExamples();
    }
}
