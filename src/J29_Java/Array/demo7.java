package J29_Java.Array;

import java.util.Arrays;
import java.util.Scanner;

// Ques: sort the array in Reverse order
public class demo7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0 , j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));



    }
}
