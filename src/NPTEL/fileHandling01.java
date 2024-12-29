package NPTEL;

import java.io.*;
import java.util.Scanner;

public class fileHandling01 {
    public static void main(String[] args) throws IOException {

        String path = "src/NPTEL/file1.txt";

        File file = new File(path);

        FileWriter fw = new FileWriter(file, true);

        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Enter s1: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        bw.write(s1);
        System.out.println("Done.");

        bw.close();
        fw.close();
        sc.close();

    }
}


// How to write new data in existing file (Append Data)
