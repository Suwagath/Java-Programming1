package Basics;

public class Factoria {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        if (n == 1) {
            System.out.println("factorial(" + n + ") = 1");
            return 1;
        } else {
            System.out.println("factorial("+ n + ") = " + n + "* factorial(" + (n - 1) +")");
            return n * factorial(n - 1) ;
        }

    }
}
