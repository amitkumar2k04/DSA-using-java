package J29_Java.Array;

import java.util.Arrays;

public class Prob64 {
    public static void main(String[] args) {
        int arr[] = {4,1,-7, 8, -1, 9, -10, -11};
        int temp[] = new int[arr.length];
        int i = 0, j = 0, k = temp.length-1;

        while (i< arr.length){
            if(arr[i] > 0){
                temp[k] = arr[i];
                i++; k--;
            } else {
                temp[j] = arr[i];
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
