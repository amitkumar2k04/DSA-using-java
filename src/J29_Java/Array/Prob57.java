package J29_Java.Array;

import java.util.Scanner;

public class Prob57 {
    public static void main(String[] args) {
//        Step 1: Creating Scanner object to to take input from the user
        Scanner sc = new Scanner(System.in);
//        Step 2: Accept the size of the array n from the user
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
//        step 3:  initialize the array
        int[] arr = new int[n];
//        Step 4: Take input of the each element into the array
        System.out.println("Enter " + n + " elements" );
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); //Read the elements of the array
        }
//        Step 5: Check if the array is sorted in the increasing order
        boolean isSorted = true; // Assuming the array is sored initially
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
//      Step 6: Printing the result based on the flag isSorted
        if(isSorted){
            System.out.println("Yes!  The given array is shorted");
        } else {
            System.out.println("No!   The given array is not shorted");
        }
    }
}
