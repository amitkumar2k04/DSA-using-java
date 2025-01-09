package DS07_DSA.sorting;


public class bubble_sort {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        // n-1 round
        for(int i = 0; i<n-1; i++){
            boolean flag = false;   // has any swapping happen
            for(int j = 0; j<n-i-1; j++){
                /*
                Last i elements are already sorted
                so no need to check them. cond -> n-i-1
                 */
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                if (flag == false){   // have any swaps happened?
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
    int arr[] = {7,6,5,4,3};
    bubbleSort(arr);
    for(int i : arr){
        System.out.println(i + " ");
    }
    }
}


// Solve by using ArrayList

//package DS07_DSA.sorting;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class bubble_sort {
//    static void bubbleSort(ArrayList<Integer> list) {
//        int n = list.size();
//        // n-1 rounds
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                /*
//                Last i elements are already sorted
//                so no need to check them. cond -> n-i-1
//                 */
//                if (list.get(j) > list.get(j + 1)) {
//                    // Swap
//                    int temp = list.get(j);
//                    list.set(j, list.get(j + 1));
//                    list.set(j + 1, temp);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 6, 5, 4, 3));
//
//        bubbleSort(list);
//
//        for (int i : list) {
//            System.out.println(i + " ");
//        }
//    }
//}

