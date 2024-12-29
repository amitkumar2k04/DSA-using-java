package J29_Java.Array;

public class Prob56 {
    public static void main(String[] args) {
        int[] arr = {2,96,69,77,145,20};

        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i]; //update the largest to the current element
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second greatest element = " +secondLargest);
    }
}
