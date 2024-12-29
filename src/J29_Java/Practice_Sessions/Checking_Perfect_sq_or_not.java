package J29_Java.Practice_Sessions;

import java.util.Scanner;
import java.lang.Math;

public class Checking_Perfect_sq_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int)Math.sqrt(n);
        if(a * a == n) System.out.println("Perfect square");
        else System.out.println("not perfect square");
    }
}
