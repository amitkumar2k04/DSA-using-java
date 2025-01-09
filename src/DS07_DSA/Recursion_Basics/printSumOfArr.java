package DS07_DSA.Recursion_Basics;

public class printSumOfArr {
    static int sumOfArr(int[] arr, int idx){
        // base case
        if (idx == arr.length) return 0;
       // if(idx == arr.length-1) return arr[idx];

        // recursive work
        int smalllAns = sumOfArr(arr, idx+1);

        // self work
        return arr[idx] + smalllAns;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,8,3,7};
        System.out.println(sumOfArr(arr, 0));
    }
}
