package J29_Java;

import java.io.IOException;
import java.util.Scanner;

// Taking input from the user
public class BufferedReader_Demo {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number: ");
        //int num = System.in.read();

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();

//        int num = Integer.parseInt(bf.readLine());
        System.out.println(num2);

        /* Note:
        1. Whenever you use BufferedReader it will try to access InputStreamReader.
        2. BufferedReader it takes input from anywhere not only from system keyboard, but also from file, network etc.
        3. We have to choices to take input from the user: 1. Use BufferedReader 2. Scanner class
         */
    }
}
