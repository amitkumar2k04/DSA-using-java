package J29_Java.Array;

import java.util.Scanner;

public class Prob58 {
    public static void main(String[] args) {
//    Step 1: Creating the scanner object to take the input from the user
        Scanner sc = new Scanner(System.in);
//        Step 2: Accept the size of the array from the user
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
//        Step 3: initializing the original array
        int[] arr = new int[n];
//        Step 4: Take input from each element of the array
        System.out.println("Enter " + n + " elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        Step 5: initialize the new array to store the new elements in the reverse order
        int[] reverseArr = new int[n];
//        Step 6: copy elements from original array into new array in reverse order
        for(int i = 0; i<n; i++){
            reverseArr[i] =  arr[n-1-i];
        }
//        Step 7: Print the elements of the reverse array
        for(int i=0; i<n; i++){
            System.out.println(reverseArr[i] + " ");
        }
    }
}
