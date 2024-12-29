package NPTEL;

import java.io.*;

// How to Read the console of a file and print it over the console.
// How to count the number of character in a file.

public class fileHandling02 {
    public static void main(String[] args) throws IOException {

        String path = "src/NPTEL/file1.txt";

        File file = new File(path);

        FileReader rw = new FileReader(file);

        BufferedReader br = new BufferedReader(rw);

        int c;
        int countChar = 0;

        while ((c = br.read()) != -1){
           // System.out.print((char) c);
            countChar++;

        }
        System.out.println(countChar);
        System.out.println("Done..");


    }
}
