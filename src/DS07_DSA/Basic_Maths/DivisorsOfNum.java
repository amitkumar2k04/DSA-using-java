package DS07_DSA.Basic_Maths;
// Brute Force Approach
public class DivisorsOfNum {
    public static int[] printDivisors(int n, int[] size) {
        int[] divisors = new int[n];
        // Initialize the count of divisors
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // Add the divisor to the array
                divisors[count++] = i;
            }
        }
        // Update the size parameter
        // with the count of divisors
        size[0] = count;
        // Return the array of divisors
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] size = new int[1];
        int[] divisors = printDivisors(number, size);

        System.out.print("Divisors of " + number + " are: ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();
    }
}

/*
Algorithm:

Step 1:Initialise an array to store the divisors.

Step 2:Iterate from 1 to n using a loop variable ‘i’. For each value of ‘i’:
        * Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).
        * If i is a divisor, store it in the array of divisors and increment the count of divisors.

Step 3:After the loop, return the array of divisors.

Note: Time Complexity: O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check if it is a divisor.

 */