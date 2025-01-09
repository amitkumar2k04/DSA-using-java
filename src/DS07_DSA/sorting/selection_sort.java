package DS07_DSA.sorting;

public class selection_sort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                // find min element in unsorted part of the array
                if(arr[j] < arr[minIndex]){
                    // minIndex update
                    minIndex = j;
                }
            }
            /*
                swap current element and minimum element
                -> isse milega current index i will have correct element
                swap(arr[minIndex], arr[i])
                 */
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
