package DS07_DSA.Recursion_Basics;

import java.util.Scanner;

public class printMultiple {
    static void printMultiples(int n, int k){
        // Base case
        if (k == 0){
            return;
        }
        // recursive work
        printMultiples(n, k-1);

        // self work
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        printMultiples(n,k);
    }
}
