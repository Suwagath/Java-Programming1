package Basics;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("What's your fav number?");

        try {
            int n = scan.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Sorry, please enter a number");
        }*/


        try {
            int[] a = null;
            System.out.println(a[1]);
        } catch (NullPointerException e) {
            System.out.println("Your array is null!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds!");
        } catch (Exception e) {
            System.out.println("Something else went wrong!");
        }
    }
}
