package J29_Java.Array.Practice;

import java.util.Scanner;

class Questions_1 {
        static boolean isSorted(int[] arr){
            boolean check = true;
            for (int i = 1; i< arr.length; i++){
                /*
                i = 0
                arr[0] < arr[-1]
                 */
                if(arr[i] < arr[i-1]){
                    // not sorted
                    check = false;
                }
            }
            return check;
        }
    }

public class Q_checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Is Sorted " + Questions_1.isSorted(arr));
    }
}
