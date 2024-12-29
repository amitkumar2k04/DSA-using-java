package J29_Java.Array.Practice;

import java.util.Scanner;

public class sortZerosAndOnes_Optimised {
    static void SortZerosAndOnes(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                    left++;
                    right--;
                }
                if(arr[left] == 0){
                    left++;
                }
                if(arr[right] == 1){
                    right--;
                }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

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

        System.out.println("Original array: ");
        printArray(arr);

        SortZerosAndOnes(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}