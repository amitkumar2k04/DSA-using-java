package J29_Java.Practice_Sessions;
import java.util.Scanner;

public class Movie_rating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();
        System.out.println("movie name: ");
        String name = sc.nextLine();
        if(rating >= 0.0 && rating <= 2.5){
            System.out.println(name + " movie is flop");
        } else if (rating >= 2.6 && rating <= 4.5) {
            System.out.println(name + " movie is semi-flop");
        } else if (rating >= 4.5 && rating <= 7.5) {
            System.out.println(name + " movie is hit");
        } else if (rating >= 7.5 && rating <= 10.5) {
            System.out.println(name + " movie is super hit");
        }

    }
}
