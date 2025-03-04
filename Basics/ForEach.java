package Basics;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

/*
       String[] cars = {"BMW M2", "Veloster N", "GTI"};

       for (String car : cars) {
           System.out.println(car);
       }*/

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(90);

        for (int number:numbers) {
            System.out.println(number);
        }

    }
}
