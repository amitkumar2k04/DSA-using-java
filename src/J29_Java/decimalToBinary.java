package J29_Java;

import java.util.Scanner;

public class decimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();

        int ans = 0; // binary number
        int pw = 1; // powers of 10

        while (decimalNumber > 0){
            int parity = decimalNumber % 2;
            ans += (parity * pw);
            pw *= 10;
            decimalNumber /= 2; // getting a patity number
        }
        System.out.println(ans);

    }
}
