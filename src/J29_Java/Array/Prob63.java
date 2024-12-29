package J29_Java.Array;

public class Prob63 {
    public static void main(String[] args) {
        // Binary search
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int index = -1;
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end) / 2;

        while (start <= end) {
            // case 1:
            if (arr[mid] == target){
                index = mid;
                break;
            }
            // case 2:
            else if(target < arr[mid]){
                end = mid - 1;
            } else {
                //case 3:
                start = mid - 1;
            }
        }
        System.out.println("Target found at " + index);
    }
}
