package J29_Java.Stringss;

public class str_Builder02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("physics");
        //sb.reverse();
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);   // psics
    }
}
