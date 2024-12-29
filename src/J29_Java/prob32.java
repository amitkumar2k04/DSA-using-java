package J29_Java;
import java.util.Scanner;

public class prob32 {
    public static void main(String[] args) {
//        32- Check if the number is Prime or not.
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int count = 0;
//        for(int i = 1; i <= n; i++){
//            if(n % i == 0) count ++;
//        }
//        if (count == 2) System.out.println("The given number is prime number");
//        else System.out.println("The Given number is not prime number");



//        // Optimised version of the above code
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int count = 0;
//        for(int i = 1; i <= n/2; i++){
//            if(n % i == 0) count ++;
//        }
//        if (count == 1) System.out.println("The given number is prime number: ");
//        else System.out.println("The Given number is not prime no");



//                // 2nd approach (minor change)
//        int n = sc.nextInt();
//        int count = 0;
//        System.out.println("Enter the number: ");
//        for(int i = 2; i <= n/2; i++){
//            if(n % i == 0) count ++;
//        }
//        if (count == 0) System.out.println("The given number is prime number: ");
//        else System.out.println("The Given number is not prime no");





                // 3rd Approach
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        boolean isPrime = false;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                isPrime = true;
                break;
            }
        }
        if (isPrime) System.out.println("The given number is prime number");
        else System.out.println("The Given number is not prime no");

    }
}
