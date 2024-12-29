package DS07_DSA.Basic_Maths;

import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args) {
        // Declare a variable 'n' to
        // store the input integer.
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // Initialize a variable 'revNum' to
        // store the reverse of the input integer.
        int revNum = 0;

        while(n != 0){
            int ld = n % 10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) return;
            else {
                revNum = (revNum * 10) + ld;
                n = n / 10;
            }
        }
        System.out.println(revNum);
    }
}

// if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) return;
// This condition is a safety check to ensure that the reversed number (revNum) does not overflow or underflow the limits of an integer
                // Integer.MAX_VALUE: The maximum value a 32-bit signed integer can hold: 2,147,483,647.
                // Integer.MIN_VALUE: The minimum value a 32-bit signed integer can hold: -2,147,483,648
// Why MAX_VALUE / 10 and MIN_VALUE / 10?
        //If revNum > Integer.MAX_VALUE / 10, multiplying it by 10 will result in a number larger than Integer.MAX_VALUE.
        //Similarly, if revNum < Integer.MIN_VALUE / 10, multiplying it by 10 will result in a number smaller than Integer.MIN_VALUE.