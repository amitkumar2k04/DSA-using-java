package DS07_DSA.sorting.Non_Comparison_Sorting;

public class count_sort {
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basicCountSort(int[] arr){   // 2 4 2 2
        int max = findMax(arr);  // find the largest element of the array
        int[] count = new int[max + 1];
        for(int i = 0; i<arr.length; i++){
            /*
            0 0 3 0 1  - freq of elements
            0 1 2 3 4 - Index
             */
            count[arr[i]]++;  // counting the frequency of the array
        }
        int k = 0;
        for(int i = 0; i<count.length; i++){  // 0 2 0 3 1 2
            for(int j = 0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        basicCountSort(arr);
        displayArr(arr);
    }
}
