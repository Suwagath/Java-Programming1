package Basics;

public class Scope {

    static int c = 0;
    public static void main(String[] args) {
 /*       int a = 0;
        System.out.println(a);

        if (a == 0) {
            int b = 1;

            System.out.println(b);
        }
        System.out.println(b);*/

        add(5, 6);
       System.out.println(c);
    }
    public static void add(int a, int b) {
        int sum = a + b;
        int c = 9;
        System.out.println(sum);
    }
}
