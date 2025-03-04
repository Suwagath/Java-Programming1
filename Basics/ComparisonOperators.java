package Basics;

import java.sql.SQLOutput;

public class ComparisonOperators {
    public static void main(String[] args) {

        // == is equal to
        // <= less than or equal to
        // >= greater than or equal to
        // || or

        /*int a = 5;
        int b = 4;

        boolean c = a >= b;*/

        double a = 2.4;

        if (a == 2.4){
            System.out.println("They are equal");
        }
        if (a > 7){
            System.out.println("Greater than 7");
        }
        if (a == 2.4 || a == 2.5){
            System.out.println("a is 2.4 or 2.5");
        }
        if (a >= 0 && a <= 100) {
            System.out.println("a is between 0 and 100");
        }


    }
}
