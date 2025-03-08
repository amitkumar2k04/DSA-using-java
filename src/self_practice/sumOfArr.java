package self_practice;


import java.util.Scanner;

public class sumOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements");
        int[] arr = new int[size];
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("ans" + sum);

    }
}
