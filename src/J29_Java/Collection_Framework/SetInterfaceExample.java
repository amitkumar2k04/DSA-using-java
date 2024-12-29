package J29_Java.Collection_Framework;

import java.util.TreeSet;

public class SetInterfaceExample {

    public static void main(String[] args) {
        //HashSet<Integer> st = new HashSet<>();
        //LinkedHashSet<Integer> st = new LinkedHashSet<>(); // jssh order me elements inset honge ushi order me print honge (I.e we are preserve the order of insertion)
        TreeSet<Integer> st = new TreeSet<>(); //
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); // 1, 2, 3
        st.add(1);
        st.add(1);
        st.add(2);
        st.add(48);
        st.add(15);
        st.add(10);

        System.out.println(st); // 1, 2, 3

        //st.remove(2);
        //System.out.println(st.contains(2)); // false: bcz 2 not avl in the set

        //System.out.println(st.size());  // 2

    }
}
