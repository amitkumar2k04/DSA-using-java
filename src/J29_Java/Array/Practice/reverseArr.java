package J29_Java.Array.Practice;

public class reverseArr {
//    static int[] reverseArray(int[] arr){
//        int n = arr.length;
//        int [] ans = new int[n];
//        int j = 0;
//
//         //traverse the original array in reverse direction
////        for(int i = n-1; i>=0; i--){
////            ans[j++] = arr[i];
////        }
//
//        // same thing can be done via while loop also
//        int i = n-1;
//        while (i>=0){
//            ans[j++] = arr[i--];
//        }
//        return ans;
//
//    }


    //=======================================================================
    //solution via 2nd approach -> No need to create new ans array -> same array me changes kar reverse kre
    static void swapInArray (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;

        while (i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    //int[] ans = reverseArray(arr);
        reverseArray(arr);
        //printArray(ans);
        printArray(arr);
    }
}
