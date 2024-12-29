package J29_Java.Array;

import java.util.Arrays;

public class Prob66 {
//    Bubble sort

    public static void main(String[] args) {
        int[] arr = {4,7,85,36, 9, 441,2};
        for(int i = 0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if (arr[j+1] < arr[j]) {
                    // Swapping process
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
