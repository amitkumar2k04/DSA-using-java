package J29_Java;
import java.util.Scanner;

public class GuesserGame {
    public static void main(String[] args) {
        int ourGuess = (int) (Math.random() * 1000) + 1;
        Scanner sc = new Scanner(System.in);
        int guesses = 10;
        do {
            System.out.println("Enter the number: ");
            int userGuess = sc.nextInt();
            if (userGuess == ourGuess) {
                System.out.println("Winner Winner paneer dinner");
                break;
            } else if (userGuess < ourGuess) {
                System.out.println("Too small. Think larger");
            } else {
                System.out.println("Too large. Think smaller");
            }

            if (--guesses == 0) {
                System.out.println("Loser");
                break;
            }
        } while (true);
    }
}
