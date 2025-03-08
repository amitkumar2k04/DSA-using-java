package J29_Java.Stringss.Questions;

import java.util.Scanner;

public class toggleEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());

        System.out.println(str);

        // toggle
        for(int i = 0; i<str.length(); i++){
            boolean flag = true;  // true -> already capital
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii > 90) flag = false; // small letter
            if(flag == true) {
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            } else { // already small letter then convert it into capital
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }

        }
        System.out.println(str);
    }
}
