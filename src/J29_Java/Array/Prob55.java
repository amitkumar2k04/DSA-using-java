package J29_Java.Array;

public class Prob55 {
    public static void main(String[] args) {
    int[] arr = {2,96,69,77,145,20};

    int maxElement = arr[0]; // Assuming the 1st element is greatest initially
    int maxIndex = 0;

    for(int i = 1; i< arr.length; i++){
        if (arr[i] > maxElement){
            maxElement = arr[i];  //update
            maxIndex = i;
        }
        System.out.println("Max element " + maxElement + " found at " + maxIndex + " index");
    }

    }
}
