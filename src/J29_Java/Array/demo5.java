package J29_Java.Array;

import java.util.Scanner;

public class demo5 {
    // Ques: find the 2nd maximum of an element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int f_Max = Math.max(arr[0], arr[1]);
        int s_Max = Math.min(arr[0], arr[1]);
        for(int i = 2; i<arr.length; i++){
            if(arr[i] < f_Max){
                s_Max = f_Max;
                f_Max = arr[i];
            } else if ( arr[i] > s_Max){
                s_Max = arr[i];
            }
        }
        System.out.println("Second max element: " + s_Max);

    }
}
