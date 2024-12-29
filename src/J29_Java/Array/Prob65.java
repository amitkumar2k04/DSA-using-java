package J29_Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Prob65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-7, -1, -10, -11, 1, 9, 4, 8};
        int i = 0, j = 0;
        while(i<arr.length){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
