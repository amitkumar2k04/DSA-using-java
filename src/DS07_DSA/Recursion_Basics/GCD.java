package DS07_DSA.Recursion_Basics;

import java.util.Scanner;

public class GCD {
    static int iterative_GCD(int x, int y){
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    static int recursive_GCD(int x, int y){
        if(y == 0){
            return x;
        }
        return recursive_GCD(y, x % y);
    }
    static int lcm (int x, int y){
        int gcd_value = recursive_GCD(x, y);
        return (x * y) / gcd_value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        //System.out.println(iterative_GCD(x, y));
        //System.out.println(recursive_GCD(x, y));
        System.out.println(lcm(x, y));
    }
}
