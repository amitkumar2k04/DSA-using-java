package J29_Java.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            throw new RuntimeException("Sorry you can't vote!!");
        }else{
            System.out.println("You are eligible to vote!!");
        }


//        int dividend = sc.nextInt();
//        int divisor = sc.nextInt();
//        int arr[] = new int[5];
//
//        try{
//            System.out.println("I am in first try block!!");
//            try{
//                arr[6] = 10;
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//            }catch (Exception e){
//            System.out.println(e.getMessage());
//        }




//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }








//        try{
//            int result = dividend/divisor;
//            System.out.println("Your ans is : " +result);
//        } catch (ArithmeticException e){
//            System.out.println("Divisor can't be 0!!");
//        }

    }
}
