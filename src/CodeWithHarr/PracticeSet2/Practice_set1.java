package CodeWithHarr.PracticeSet2;

import java.util.Scanner;

public class Practice_set1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                // Input marks of 5 subjects
                System.out.println("Enter the marks of maths: ");
                float maths = sc.nextFloat();

                System.out.println("Enter the marks of physics: ");
                float physics = sc.nextFloat();

                System.out.println("Enter the marks of chemistry: ");
                float chemistry = sc.nextFloat();

                System.out.println("Enter the marks of biology: ");
                float biology = sc.nextFloat();

                System.out.println("Enter the marks of English: ");
                float english = sc.nextFloat();

                // Calculate totol marks
                float totalMarks = maths + physics + chemistry + biology + english;

                // calculate percentage
                float percentage = (totalMarks / 500) * 100;

                // display percentage
                System.out.println("The percentage of the student is: " + percentage);

    }
}
