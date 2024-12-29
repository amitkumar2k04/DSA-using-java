package CodeWithHarr.Arrays_practice_set;

public class prob02 {
    public static void main(String[] args) {
        // write a program to find out weather a given integer is present in an array or not.
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element: marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is not present in the array");
        } else {
            System.out.println("The value present in the array");

        }
    }
}
