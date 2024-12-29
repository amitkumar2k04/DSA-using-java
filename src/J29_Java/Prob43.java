package J29_Java;
import java.util.Scanner;

public class Prob43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Constant");
        }

    }
}
