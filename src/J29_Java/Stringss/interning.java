package J29_Java.Stringss;

public class interning {
    public static void main(String[] args) {

        String s = "Hello";     // Heylo  // 2 update
        //String x = "Hello";
        //x = "Mello";
        //System.out.println(s);

        // 2 -> y;
        s = s.substring(0,2) + 'y' +s.substring(3);  // same string me change nahi hui  ek new string bna
        System.out.println(s);



    }
}
