package J29_Java.Array;

import java.util.Scanner;
// Ques : Printing the sum of the Array
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int sum = 0;
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
            System.out.println("Sum" + sum);
    }
}
