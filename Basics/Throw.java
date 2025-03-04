package Basics;

import java.io.*;

public class Throw {
    public static void main(String[] args) throws FileNotFoundException {

    }
    public static void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"));
    }
}
