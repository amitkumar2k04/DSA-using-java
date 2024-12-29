package J29_Java;
import java.util.Scanner;

public class prob33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        33- Write a program to take two inputs a, b & find the value of a  raised to the power of b.
        Ex - a = 2, b = 5
        OP - 2^5 = 32
 */
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= b; i++){
            ans = ans *  a;
        }
        System.out.println(ans);


    }
}
