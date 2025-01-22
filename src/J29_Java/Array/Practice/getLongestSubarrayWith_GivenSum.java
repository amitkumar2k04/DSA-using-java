package J29_Java.Array.Practice;

public class getLongestSubarrayWith_GivenSum {
    public static int getLongestSubarray(int[] arr, long k){
        int n = arr.length;
        int len = 0;
        for(int i = 0; i<n; i++){
            long sum = 0;
            for(int j = i; j<n; j++){
                sum+=arr[j];
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
    T.C - Near about o(n2) - bez we are using two loops here & every loops run to n times. This is Optimizing the Naive Approach (Using two loops):
    S.C - o(1)
 */
