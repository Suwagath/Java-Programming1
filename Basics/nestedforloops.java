package Basics;

public class nestedforloops {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/
       // String[] colors = {"Red", "Green", "Blue"};

     /*   for (String color : colors) {
            System.out.println(color);
        }*/
        System.out.println("------------");

        String[][] fancyColors = {{"Red", "Green", "Blue"},
                                  {"Cyan", "Magenta", "Turquoise"}};

        for (int row = 0; row < 2; row++){
            for (int col = 0; col < 3; col++){
                //System.out.println(fancyColors[row][col]);
            }
        }

        System.out.println("-----------------------");

        for (int i = 0;  i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
