package self_practice;

public class findMaxEle {
    public static void main(String[] args) {
        int[] arr = {2, 96, 69, 77, 145, 20};
        int maxEle = arr[0];
        int maxIndex = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max element is " + maxEle + " is at Index" + maxIndex);
    }
}
