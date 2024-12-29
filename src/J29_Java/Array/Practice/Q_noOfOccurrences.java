package J29_Java.Array.Practice;
// Ques: Count the number of occurrences of a particular element x
import java.util.Scanner;

class Questions {
    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}

public class Q_noOfOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Count of x will be: " + Questions.countOccurrences(arr, x));

    }
}
