package J29_Java.Array.Practice;

import java.util.Scanner;

public class SortSquareArr {
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while (left <= right){
            // bigger number's squares is added to ans
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void swapInArray (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;

        while (i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
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

        int [] ans = sortSquares(arr);
        System.out.println("Sorted array:");
        reverseArray(ans);
        printArray(ans);
    }
}
