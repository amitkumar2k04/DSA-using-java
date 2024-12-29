package J29_Java.Array.Practice;
// Ques: Rotate the given array 'a' by k step where k is non-negative. Here we are using extra variable ans to store the answer.
import java.util.Scanner;

public class k_StepArrRotation {
    static int[] rotate(int[] arr, int k){   // k is the no of steps to be rotated
        int n = arr.length;
        k = k % n;   // this is bcz k can be greater than (size of the array 'n'), so if k grater than n then repetition occurs
        int [] ans = new int [n];
        int j = 0;

        // Traversing 2nd part of the array
        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        // Traversing 1st part of the array
        for(int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    // Printing
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array: ");
        printArray(arr);

        int[] ans = rotate(arr, k);

        System.out.println("Array after rotation: ");
        printArray(ans);
    }

}
