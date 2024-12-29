package J29_Java;
import java.util.Scanner;

public class Prob41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            // Task
            System.out.println("Welcome to Calculator");
            System.out.println("1 - Add");
            System.out.println("2 - Multiply");
            System.out.println("3 - divide");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers to add: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum = " + (a + b));
                    break;

                case 2:
                    System.out.println("Enter two numbers to multiply: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Product = " + (x * y));
                    break;

                case 3:
                    System.out.println("Enter two numbers to divide: ");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("divide = " + (c / d));
                    break;
                case 4:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }

            System.out.println(); // Print a blank line for better readability

        } while (choice != 4);  // The loop will keep running until the user chooses to exit

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
