package Basics;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your question: ");
            scan.next();

            Random rand = new Random();
            int r = rand.nextInt(5);

            if (r == 0) {
                System.out.println("As I see it, yes.");
            } else if (r == 1) {
                System.out.println("Signs says yes.");
            } else if (r == 2) {
                System.out.println("Reply hazy, try again.");
            } else if (r == 3) {
                System.out.println("Don't count on it.");
            } else if (r == 4) {
                System.out.println("OutLook not so good.");
            }}



       /* System.out.println("As I see it, yes.");
        System.out.println("Signs says yes.");
        System.out.println("Reply hazy, try again.");
        System.out.println("Don't count on it.");
        System.out.println("OutLook not so good.");*/
    }
}
