package J29_Java.Array.Practice;
// Ques: Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no value is being repeated, return -1.
// array a = 1,5,3,4,6,3,4    o/p = 3
import java.util.Scanner;

public class repeatingNumber {
//    static int firstRepeatingNumber(int[] arr){
    static int lastRepeatingNumber(int[] arr){
        int n = arr.length;

//        for(int i = 0; i<n; i++){ // first number
        for(int i = n-1; i>=0; i--){ // returning last val that is repeating in the array
//            for(int j = i+1; j<n; j++){  //second number
            for(int j = i-1; j>=0; j--){  //returning last val that is repeating in the array
                if(arr[i] == arr[j]){ // found answer
                    return arr[i];
                }
            }
        }
        return -1;
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

//        System.out.println("First repeating number: " + firstRepeatingNumber(arr));
        System.out.println("Last repeating number: " + lastRepeatingNumber(arr));
    }
}
