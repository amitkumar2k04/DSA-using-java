package J29_Java.Array.Practice;
// Find the last occurrences of an element x in the given array.
import java.util.Scanner;

class Question {
    static int lastOccurrences (int [] arr, int x) {
        int lastIndex = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}

public class Q_lastOccOfElement {
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

        System.out.println("Last occurrences of X: " + Question.lastOccurrences(arr, x));

    }
}
