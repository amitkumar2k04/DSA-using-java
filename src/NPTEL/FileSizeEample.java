package NPTEL;

import java.io.File;

// Calculating the size of the file

public class FileSizeEample {
    public static void main(String[] args) {

        // Specify the file path
        String path = "src/NPTEL/file1.txt";

        // Create a File object
        File filePath = new File(path);

        // Get the size of the file
        long fileSize = filePath.length();

        // Print the size of the file
        System.out.println(fileSize);
    }
}
