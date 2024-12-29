package J29_Java;

import java.util.Scanner;

public class recursionDemo {
    static void temp (int n) {
        if(n == 0) return;
//        System.out.println(n);
        temp(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        temp(n);
    }
}
