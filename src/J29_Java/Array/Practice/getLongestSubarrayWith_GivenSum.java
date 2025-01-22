package J29_Java.Array.Practice;

public class getLongestSubarrayWith_GivenSum {
    public static int getLongestSubarray(int[] arr, long k){
        int n = arr.length;
        int len = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                // add all the elements of subArray
                // In this way we can find entire sum of subArray from i to j
                long sum = 0;
                for(int K = i; K<=j; K++){
                    sum+= arr[K];
                }
                // But now we require subArr of longest and equal to k
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        long k = 3;
        int length = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subArray is: "+length);
    }
}


// This is the brute force approach - we further better approach it By using Hashing
// Same question solved by using Hashing in the Hashing folder.


/*
 Analyzing Time & space complexity
    T.C - Near about o(n3) - bez we are using three loops here & every loops run to n times.
    S.C - o(1)
 */
