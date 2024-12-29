package J29_Java.Array.Practice;

import java.util.Scanner;

public class k_StepArrRotationWithoutExtraSpace {

    // swapping
    static void swap(int[] arr, int st, int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr, int st, int end){
        while (st < end){
            swap(arr, st, end);
                st++;
                end--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    // Printing
    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array: ");
        printArray(arr);

        rotateInPlace(arr, k);

        System.out.println("Array after rotation: ");
        printArray(arr);
    }
}
