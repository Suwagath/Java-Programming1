package Basics;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

       /* try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is in 'finally', it always gets run!");
        }*/
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(scan.next());
        } catch (Exception e) {
            System.out.println(e);;
        } finally {
            scan.close();
        }

    }
}
