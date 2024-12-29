package J29_Java.Array.Practice;

import java.util.Arrays;
import java.util.Scanner;
class Questions_2 {
    static  int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
}
public class Q_smallest_largest_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int [] ans = Questions_2.smallestAndLargestElement(arr);
        System.out.println("smallest: " +ans[0]);
        System.out.println("largest: " +ans[1]);


    }
}
