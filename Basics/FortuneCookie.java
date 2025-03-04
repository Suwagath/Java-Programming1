package Basics;

import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {

    static String[] fortunes = {
        "Do not be afraid of competition.",
        "An exciting opportunity lies ahead of you.",
        "You love peace.",
        "Get your mind set…confidence will lead you on.",
        "You will always be surrounded by true friends.",
        "Sell your ideas-they have exceptional merit.",
        "You should be able to undertake and complete anything.",
        "You are kind and friendly."
    };

    public static void main(String[] args) {
        while (true) {
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            System.out.println("Press enter for your fortune...");
            scan.nextLine(); // Waits for the user to press Enter

            int i = rand.nextInt(fortunes.length);
            System.out.println(fortunes[i]);
        }

    }
}
