package Basics;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2005, 9, 1);
        int years = Period.between(birthDate, today).getMonths();

        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);
    }
}
