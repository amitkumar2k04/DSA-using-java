package DS07_DSA.Binary_search;

public class book_allocation {
    static boolean isValid(int[] arr, int n, int m, int max){
        int student = 1;   // Start with the first student
        int sum = 0;    // Sum of pages allocated to current student
        for(int i = 0; i<n; i++){
            if(arr[i] > max) return false;  // a single book has more than pages than limit
            if(sum + arr[i] > max){
                student++;
                sum = arr[i];
                if(student > m) return false;
                else sum += arr[i];
            }
        }
        return true;
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findPages(int[] arr, int n, int m){
        // book allocation impossible
        if(m > n) return -1;
        int low = findMax(arr);
        int high = 0;
        for(int i = 0; i<n; i++){
            high+=arr[i];
        }
        int result = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (isValid(arr, n, m, mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int n = 4;
        int m = 2;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }
}


/*
Example 1:
Input Format:
n = 4, m = 2, arr[] = {12, 34, 67, 90}
Result:
 113


 Example 2:
 Input Format:
 n = 5, m = 4, arr[] = {25, 46, 28, 49, 24}
Result:
 71
 */
