package NPTEL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// How to count the number of Lines in a file.

public class fileHanding03 {
    public static void main(String[] args) throws IOException {
        String path = "src/NPTEL/file1.txt";

        File file = new File(path);

        FileReader rw = new FileReader(file);

        BufferedReader br = new BufferedReader(rw);

        int c;
        int countLines = 0;

        while ((c = br.read()) != -1){
            if((char)c == '\n'){
                countLines ++;
            }
        }
        countLines ++;

        System.out.println(countLines);
        System.out.println("Done..");
    }
}


