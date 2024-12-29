package J29_Java;
import java.util.Scanner;
public class Prob40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Concept of do-while loop
        int in;
        do {
            System.out.println("Hello");
            System.out.println("Press 1 to repeat");
            in = sc.nextInt();
        } while (in == 1);
    }
}
