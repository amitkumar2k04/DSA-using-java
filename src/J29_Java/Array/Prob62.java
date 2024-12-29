package J29_Java.Array;

public class Prob62 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int index = -1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Target found at index " +index);
    }
}
