package DS07_DSA.Recursion_Basics;

import java.util.Scanner;

public class SeriesSum {

    // Main Question -> Alternate Sum
    static int seriesSum(int n){
        // Base Case
        if(n == 0) return 0;

        // Recursive work
        if (n % 2 == 0){
            return seriesSum(n-1) - n;
        } else {
            return seriesSum(n-1) + n;
        }
    }


// Sum of n natural numbers

//    static int SeriesSum_1(int n){
//        // Base case
//        if(n == 0) return 0;
//
//        // Recursive Work
//        //return SeriesSum_1(n-1) + n;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(SeriesSum_1(n));
        System.out.println(seriesSum(n));
    }
}
