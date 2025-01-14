package DS07_DSA.sorting;

public class quick_sort {
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y] = temp;
    }
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    // self work
    static int partition(int[] arr, int st, int end){
        // step 1 : choose pivot & put it at its right position
        int pivot = arr[st];
        int cnt = 0; // count all elements, less than pivot
        for(int i = st+1; i<=end; i++){
            if(arr[i] < pivot) cnt++;
        }
        int pivotIndex = st + cnt;
        swap(arr, st, pivotIndex);

        // Step 2: re-arranging elements before and after pivotIndex
        // such that: element lesser or equal than pivot -> left side && elements greater than pivot -> right side
        int i = st, j = end;
        while(i<pivotIndex && j<pivotIndex){
            while(arr[i] <= pivotIndex) i++;
            while(arr[j] > pivotIndex) j--;
            if(i<pivotIndex && j<pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;

    }
    static void quickSort(int[] arr, int st, int end ){
        // base case
        if(st > end) return;
        int PI = partition(arr, st, end);
        // recursive work
        quickSort(arr, st,  PI-1);
        quickSort(arr, PI + 1, end);
    }
    public static void main(String[] args) {
        int[] arr = {6,4, 3, 1, 5, 4};
        System.out.println("Array before sorting:");
        displayArr(arr);
        System.out.println();

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting:");
        displayArr(arr);
    }
}
