package J29_Java;

import java.util.Scanner;

public class fibbonachi_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        System.out.println(first+ " " + second+ " ");

        for(int i = 0; i <= n-2; i++){
            third = first + second;
            System.out.print(third);
            first = second;
            second = third;
        }
    }
}
