package J29_Java;

import java.util.Scanner;

public class Prob54 {
    public static void main(String[] args) {
        // Step 1: Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Step 2: Accept the size of the array (n) from the user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Read the size of the array

        // Step 3: Initialize the array of size 'n'
        int arr[] = new int[n];

        // Step 4: Take input for each element in the array
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt(); // Read elements into the array
        }

        // Step 5: Calculate the sum of the array elements
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum = sum + arr[i];  //Adding each element to sum
        }

        // Step 6: Calculate the mean (average) of the array elements
        double mean = (double) sum / n;  // Type cast to double for decimal result


        System.out.println("Sum of all elements = " + sum);
        System.out.println("Avg of all the elements = " +mean);
    }
}