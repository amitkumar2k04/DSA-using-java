package DS07_DSA.Recursion_Basics;

public class FindMaxArr {
    // By iterative approach
//    static int maxArray(int[] arr, int idx){
//        int MX = Integer.MIN_VALUE;
//        int n = arr.length;
//        for (int i = 0; i<n; i++){
//            MX = Math.max(arr[i], MX);
//        }
//        return MX;
//    }
    static int maxInArray(int[] arr, int idx){
        // base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        // small problem -> idx+1
        int smallAns = maxInArray(arr, idx+1);

        // Self Work
        return Math.max(arr[idx], smallAns);
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 3, 2, 5};

        //System.out.println(maxArray(arr, 0));
        System.out.println(maxInArray(arr, 0));
    }
}
