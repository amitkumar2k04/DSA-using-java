package CodeWithHarr;

import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
/*
        int a = sc.nextInt();
        int a = sc.nextInt();
*/
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
/*
        int b = sc.nextInt();
        int b = sc.nextInt();
*/
        float b = sc.nextFloat();
//        int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);

//        String str = sc.nextLine();       // nextLine() -> reads the whole line
//        String str = sc.next();           // next() -> reads the only first word
//        System.out.println(str);
    }
}
