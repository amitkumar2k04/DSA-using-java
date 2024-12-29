package DS07_DSA.Basic_Maths;

import java.util.ArrayList;

public class DivisorsOfNum_optimised {
    public static ArrayList<Integer> findDivisors(int n) {

        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; ++i) {

            if (n % i == 0) {
                // Add divisor i to the list
                divisors.add(i);

                // Add the counterpart divisor
                // if it's different from i
                if (i != n / i) {
                    // Add the counterpart
                    // divisor to the list
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}


/*
Algorithm

Step 1: Initialise an array to store the divisors.

Step 2: Iterate from 1 to square root of n using a loop variable ‘i’. For each value of ‘i’:
            * Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).
            * If i is a divisor, add it to the vectors of divisors.
            * If i is different from n/i add the counterpart divisor n/i to the vector of divisors.
Step 3: After the loop, return the array of divisors.


Note: Time Complexity: O(sqrt(N)) where N is the input number. The algorithm iterates through each number from 1 to the square root of N once to check if it is a divisor.

 */