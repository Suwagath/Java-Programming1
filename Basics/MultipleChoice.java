package Basics;

import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String[] responses = {"", "", ""};
        String[] answers = {"c", "c", "d"};

        System.out.println("What is 2 + 2?");
        System.out.println("a) 2");
        System.out.println("b) 3");
        System.out.println("c) 4");
        System.out.println("d) 5");

        System.out.println("What is the capital of Sri lanka?");
        System.out.println("a) Nuwara - Eliya");
        System.out.println("b) Jaffna");
        System.out.println("c) Colombo");
        System.out.println("d) Kandy");

        System.out.println("What is the fastest land animal?");
        System.out.println("a) Horse");
        System.out.println("b) Jaguar");
        System.out.println("c) Rabbit");
        System.out.println("d) Cheetah");

        responses[0] = scan.next();
        responses[1] = scan.next();
        responses[2] = scan.next();

        int score = 0;
        for (int i = 0; i < responses.length; i++) {
            if (responses[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        System.out.println("Score: " + score + "/3");
    }
}
