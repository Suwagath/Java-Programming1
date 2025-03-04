package Basics;

public class Main {
    public static void main(String[] args) {
        Headphones h = new Headphones();

        System.out.println(h.charge);
        System.out.println(h.color);
        for (int i = 0; i < h.controls.length - 1; i++) {
            System.out.println(h.controls[i]);

        }
        
    }
}
