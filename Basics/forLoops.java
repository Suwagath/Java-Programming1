package Basics;

public class forLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //System.out.println("I want dogs");

        }

        for (int i = 0; i <= 15; i++) {
            //System.out.println(i);
        }

        int[] grades = {98, 45, 68, 45};

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + j);
            }
        }
    }
}
