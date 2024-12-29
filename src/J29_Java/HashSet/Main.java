package J29_Java.HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("James");
        st.add("Scott");
        st.add("James");
        System.out.println(st);  // James, Scott
        System.out.println(st.contains("James"));  // true
        System.out.println(st.size());   //2
        st.remove("James");
        System.out.println(st.contains("James"));  //false
        System.out.println(st.size());   // 1
        System.out.println("Mark");
        // traverse
        for (String s : st){
            System.out.println(s);
        }
    }
}
