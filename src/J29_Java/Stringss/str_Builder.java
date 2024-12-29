package J29_Java.Stringss;

public class str_Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        // hello -> mello
        // Use of func setCharAt(ind, ch)
        str.setCharAt(0, 'm');

        // Use of fun append()
        str.append("World");

        // use of func insert(ind, ch)
        str.insert(2,'y');    // meylloworld

        // use of func deleteCharAt(ch)
        str.deleteCharAt(0);   // eylloworld

        System.out.println(str);

    }
}
