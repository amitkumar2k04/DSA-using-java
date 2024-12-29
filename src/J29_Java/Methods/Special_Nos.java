package J29_Java.Methods;

import java.util.Scanner;

public class Special_Nos {

    public static int sod(int n) {     // (sum of digits)
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;    // extracts the last digit of n
            n = n / 10;    // removing the last digit.
            sum = sum + rem;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while (n > 9) {
            n = sod(n);
        }
        System.out.println(n == 1 ? "Special" : "Not Special");
    }
}
