package DS07_DSA.sorting;

public class insertion_sort {
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){    // i -> represents iteration no
            // step 1: fetch
            int val = arr[i];
            // step 2: compare
            int j = i-1;
            for(; j>=0; j--){
                // step 3: shifting
                if(arr[j] > val){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            // step 4: copy
            arr[j+1] = val;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,2,4,5};
        insertionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]  + " ");
        }
    }
}
