package DS07_DSA.Basic_Maths;

import java.util.Scanner;

class Armstrong_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            // Read each test case
            int num = sc.nextInt();
            if (isArmstrong(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isArmstrong(int num)
    {
        int originalNum = num;
        int sum = 0;

        // Count the number of digits
        int digits = 0;
        int temp = num;
        while (temp > 0){
            digits++;
            temp /= 10;
        }

        // Reset temp to num for digit calculation
        temp = num;

        // Calculate the sum of k-th powers of the digits
        while(temp > 0){
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        // Compare the sum with the original number
        return sum == originalNum;
    }
}