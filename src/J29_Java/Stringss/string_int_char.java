package J29_Java.Stringss;

import java.util.Scanner;

// String + int/char/String

public class string_int_char {
    public static void main(String[] args) {
        // string + int/char/string  - v.imp
        Scanner sc = new Scanner(System.in);
//        String str = "abc";
//        str = str + "xyz";
//        str = str + 10;
//        System.out.println(str);

        System.out.println("abc" + "xyz"+10+20);    // abcxyz1020
        System.out.println("abc" + "xyz"+(10+20));  // abcxyz30
    }
}



