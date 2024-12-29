package J29_Java.Array;

import java.util.Scanner;
// Ques: Check the arrays of elements is sorted or not
public class demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted? "array is sorted": "array is not sorted");

    }
}
