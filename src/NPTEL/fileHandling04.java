package NPTEL;

// How to count the number of words in a file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileHandling04 {
    public static void main(String[] args) throws IOException {

            String path = "src/NPTEL/file1.txt";

            File file = new File(path);

            FileReader rw = new FileReader(file);

            BufferedReader br = new BufferedReader(rw);

            int c;
            int countWords = 0;

            while ((c = br.read()) != -1){
                if((char)c == ' ' || (char)c == '\n'){
                    countWords ++;
                }
            }
            countWords ++;

            System.out.println(countWords);
            System.out.println("Done..");

    }
}
