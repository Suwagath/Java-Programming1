package Basics;

public class OOP_Pen {

    String type = "Gel";
    String color = "blue";
    int point = 10;

    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }
    public static void unclicked() {
        clicked = false;
    }

}

