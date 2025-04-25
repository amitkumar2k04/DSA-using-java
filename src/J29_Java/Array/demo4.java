package J29_Java.Array;

import java.util.Scanner;
// Ques : print the maximum element of an array
public class demo4 {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 2, 8, 1 };
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max Value: " + ans);
    }
}
