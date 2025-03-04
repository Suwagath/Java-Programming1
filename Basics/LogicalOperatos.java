package Basics;

import java.sql.SQLOutput;

public class LogicalOperatos {
    public static void main(String[] args) {/*
        boolean a = !true;
        System.out.println(a);*/

        int a = 3;
        int b = 4;

        boolean isSunny = false;
        boolean amSad = false;
        boolean amHappy =  false;

        if ((a < b && isSunny) || amHappy)  {
            System.out.println("It's gonna be a good");
        }
    }
}
