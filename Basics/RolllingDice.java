package Basics;

import java.util.Random;

public class RolllingDice {
    public static void main (String []args) {

        Random rand = new Random();
        int x = rand.nextInt(1,7);
        System.out.println("You rolled: " + x);
    }
}
