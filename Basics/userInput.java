package Basics;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter pokemon 1: ");
        String pokemon1 = scan.nextLine();

        System.out.println("Enter pokemon 2: ");
        String pokemon2 = scan.nextLine();

        System.out.println("Enter pokemon 3: ");
        String pokemon3 = scan.nextLine();

        System.out.println("Enter pokemon 4: ");
        String pokemon4 = scan.nextLine();

        System.out.println("Enter pokemon 5: ");
        String pokemon5 = scan.nextLine();

        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);
        System.out.println(pokemon5);

    }
}
