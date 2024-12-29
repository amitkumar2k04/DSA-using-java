package J29_Java.Array.Practice;

import java.util.Scanner;

public class prefixSum {
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        //int[] pref = new int[n];
        //pref[0] = arr[0];
        for(int i = 1; i<n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input Array");
        printArray(arr);

        // receiving ans
        int[] pref = makePrefixSumArray(arr);
        printArray(pref);
    }
}
