package Basics;

import java.sql.SQLOutput;

public class Break {
    public static void main(String[] args) {

   /*     int i = 0;

        while (i < 3) {
            System.out.println("Hi");
            i++;
            if (i == 2) {
                break;
            }

        }*/

      /*  int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {

            if (num == 30) {
                break;
            }
            System.out.println(num);
        }*/


     /*   int i = 1;

        switch (i) {
            case 0:
                System.out.println("Zerp!");
                break;
            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("WTF man??");
                break;
        }*/


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + "," +j);
                break;
            }
        }
    }
}
