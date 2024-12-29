package J29_Java.Array.Practice;

import java.util.Scanner;

public class partitionArrByPrefix_SuffixSumArr {
    static int findArraySum(int[] arr){
        int totolSum = 0;
        for(int i = 0; i < arr.length; i++){
            totolSum += arr[i];
        }
        return totolSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totolSum = findArraySum(arr);
        int prefSum = 0; // ye bata raha hai at every point ki curr prefSum kya hai
        for(int i = 0; i < arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totolSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        System.out.println("Enter " + n + " elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible: " +equalSumPartition(arr));
    }
}
