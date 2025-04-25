package J29_Java.Array.Practice;

import java.util.Scanner;

public class partitionArrByPrefix_SuffixSumArr {
//     By approach 2

//    static int findArraySum(int[] arr){
//        int totolSum = 0;
//        for(int i = 0; i < arr.length; i++){
//            totolSum += arr[i];
//        }
//        return totolSum;
//    }


//    static boolean equalSumPartition(int[] arr){
//        int totolSum = findArraySum(arr);
//        int prefSum = 0; // ye bata raha hai at every point ki curr prefSum kya hai
//        for(int i = 0; i < arr.length; i++){
//            prefSum += arr[i];
//            int suffixSum = totolSum - prefSum;
//            if(suffixSum == prefSum){
//                return true;
//            }
//        }
//        return false;
//    }


    static void printArr(int[]arr){
        for(int i = 1; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    //     By approach 1
    static int[] makePrefixSum(int[] arr){
        int n = arr.length-1;
        int[] prefix = new int[arr.length];
        for(int i = 1; i<=n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    static int[] makeSuffixSumArray(int[]arr){
        int n = arr.length-1;
        int[] suffix = new int[arr.length + 1];
        for(int i = n; i>=1; i--){
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    static boolean equalSumPartition(int[]arr){
        int[] prefSum = makePrefixSum(arr);
        int[] suffixSum = makeSuffixSumArray(arr);

        for(int i = 1; i<arr.length-1; i++){
            if(prefSum[i] == suffixSum[i+1]){
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
