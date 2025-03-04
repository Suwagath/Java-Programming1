package Basics;

public class Methods {
    public static void main(String[] args) {
        welcome();
        multiply(4, 9);
        divide(20, 4);

    }

    public static void divide(int a, int b) {
        System.out.println(a/b);
    }

    public static void welcome() {
        System.out.println("Welcome to our Calculator!!");
    }

    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
}

