package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {


   /*     int a = 0;

        while(a < 10) {
            System.out.println("a is less than 10: " + a);
            a++;
        }


        int b = 8;

        do {
            System.out.println(b);
            b++;

        } while (b < 15);*/


        String sentence = "flapjacks are awesome";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while (scan.hasNext()) {
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
