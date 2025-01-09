package DS07_DSA.Recursion_Basics;

public class printMaxInArray {
    static int printArray(int[] arr, int ind){
        // base case
        if(ind == arr.length -1){
            return arr[ind];
        }
        // recursive work [ind + 1, to end of arr tak -> se kya max hai -> find using recursion]
        int smallAns = printArray(arr, ind+1);

        // self work   // compare
        return Math.max(arr[ind],smallAns);
    }
    public static void main(String[] args) {
    int[] arr = {5,6,8,3,7};
    System.out.println(printArray(arr, 0));

    }
}
