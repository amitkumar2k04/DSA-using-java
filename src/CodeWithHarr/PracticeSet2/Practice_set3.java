package CodeWithHarr.PracticeSet2;
import java.util.Scanner;

public class Practice_set3 {
    public static void main(String[] args) {
/*  Ques:
    Write a program to find out whether a student is pass or fail, if it requires overall 40% to pass and at least 33% in each subject
    to pass Assume 3 subjects and take marks as an input from the user.
 */
/*        byte m1, m2, m3, m4, m5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics: ");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry: ");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics: ");
        m3 = sc.nextByte();
        System.out.println("Enter your marks in English: ");
        m4 = sc.nextByte();
        System.out.println("Enter your marks in Hindi: ");
        m5 = sc.nextByte();

        float avg = (m1 + m2 + m3 + m4 + m5)/5.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33 && m4>=33 && m5>=33) {
            System.out.println("Congratulations!, You have been Promoted");
        } else{
            System.out.println("Sorry!, You have not been promoted");
        }
 */
        /*
        Ques2: Calculate income tax paid by an employee to the government as per the slabs mentioned below:
               Income Slab              Tax
               2.5 L - 5.0 L            5%
               5.0 L - 10.0 L           20%
               Above 10.0 L             30%

        Note: There is no tax below 2.5 L. Take input amount as an input from the user.
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum: ");
        float tax = 0;
        float income = sc.nextFloat();
        if(income <= 2.5){
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }else if(income > 5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The totol tax paid by the employee is: " +tax);
 */

/*      Ques3:
        Write a Java program to find out the day of the week given the number
        [1 for monday, 2 for Tuesday ... and so on]
*/
/*
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
 */

/*
           Ques4:
           Write a Java program to find whether a year entered by the user is a leap year or not.
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        // Leap year rule
        // 1. Divisible by 4
        // 2. Not Divisible by 100 unless also divisible by 400
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else{
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year");
        }




/*      Ques5:
        Write a Program to find out the type of website from the URL
        .com -> For Commercial website
        .org -> For Organization website
        .in ->  For Indian website
 */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website name: ");
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("This is an Organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an commercial website");
        }else if (website.endsWith(".in")) {
            System.out.println("This is an indian website");
        }

 */


    }
}
