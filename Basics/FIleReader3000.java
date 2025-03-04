package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleReader3000 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("C:/Users/suwag/OneDrive/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("C:/Users/suwag/OneDrive/Desktop/newfile.txt");
        writer.write(fileContent);

    }
}
