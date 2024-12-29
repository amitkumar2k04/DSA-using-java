package J29_Java.Array.Practice;

import java.util.Scanner;

public class secondSmallest {
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findSecondMinimum(int[] arr){
        int min = findMin(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMin(arr);
        return secondMin;
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
        System.out.println("Second Minimum Element: " + findSecondMinimum(arr));
    }
}
