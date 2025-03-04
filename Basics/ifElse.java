package Basics;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int n = scan.nextInt();
        System.out.println(n);

        if (n >= 75 && n <= 100) {
            System.out.println("A");
        } else if (n >= 65) {
            System.out.println("B");
        } else if (n >= 55) {
            System.out.println("C");
        } else if (n >= 35) {
            System.out.println("S");
        } else if (n < 35 && n > 0) {
            System.out.println("F");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
