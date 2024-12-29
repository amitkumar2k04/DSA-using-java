package DS07_DSA.Recursion_Basics;

import java.util.Scanner;

public class printNaturalNos {


    static void printIncreasing(int n){
        // base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        // recursive work
        printIncreasing(n - 1);   // 1, 2, 3, .... ,n-1, n

        // self work
        System.out.println(n);
    }

    static void printDecreasing(int n){    // 5, 4, 3, 2, 1
        // base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        // self work
        System.out.println(n);   // n
        // recursive work
        printDecreasing(n-1);   // n-1, n-2, ..... , 1
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //printIncreasing(n);

        printDecreasing(n);
    }
}
