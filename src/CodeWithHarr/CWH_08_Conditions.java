package CodeWithHarr;

import java.util.Scanner;

public class CWH_08_Conditions {
    public static void main(String[] args) {
//        int age = 18;
//        if(age >= 18){
//            System.out.println("Yes! You Can Drive");
//        }
//        else{
//            System.out.println("No! You can not Drive");
//        }


        // Logical operators in Java
//        boolean a = true;
//        boolean b = false;
//        if (a && b) {
//            System.out.println("Y");
//        }
//        else {
//            System.out.println("N");
//        }


        int age;
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
/*
        if(age >= 56){
            System.out.println("You are experienced!");
        }
        else if(age > 46){
            System.out.println("You are Semi-Experienced");
        } else if (age > 36) {
            System.out.println("You are Semi-Semi Experienced");
        } else{
            System.out.println("You are not experienced");
        }
 */


        switch (age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to Join a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy Your Life");
        }
    }
}
