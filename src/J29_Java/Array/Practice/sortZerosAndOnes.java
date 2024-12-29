package J29_Java.Array.Practice;

import java.util.Scanner;

public class sortZerosAndOnes {

    static void SortZerosAndOnes(int[] arr){
        int n = arr.length;
        int count = 0;
        // count no of zeros
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                count ++;
            }
        }
        // add 0, from Index: 0 to count - 1   AND  add 1, from Index: 0 to n - 1
        for(int i = 0; i < n; i++){
            if(i < count){
                arr[i] = 0;
            } else {
                arr[i] = 1;
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


// Note: Here problem is that, we're traverse the same array two times.
//       Now, we want to complete this ques in only 1 traversal.