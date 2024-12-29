package J29_Java.Methods;

import java.util.Scanner;

public class Prob67 {

//    public static int fact(int n){
//        int fact = 1;
//        while (n != 0) {
//            fact = fact * n--;
//        }
//        return fact;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n  = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//        while (n != 0){
//            int rem = n%10;
//            sum += fact(rem);
//            n = n/10;
//        }
//        System.out.println(sum == temp ? "strong" : "Not strong");
//    }


    public static int fact(int n){

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while(n != 0){
            int rem = n % 10;   // extracts the last digit of n
            n = n/10;     // removing the last digit.
            sum = sum + fact(rem);
        }
        if(sum == temp){
            System.out.println("Strong number");
        } else System.out.println("Not a strong number");

    }
}
