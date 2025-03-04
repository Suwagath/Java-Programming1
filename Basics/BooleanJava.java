package Basics;

public class BooleanJava {
    public static void main(String[] args) {
       /* int a = 10;
        boolean b = (a == 10);
        System.out.println(b);*/

        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;

        if (missedDoor) {
            System.out.println("We passed the first door!");
            doorCount += 1;
        }
        if (passedDoor) {
            System.out.println("We passed the second door!");
            doorCount += 1;
        }
        if (passedDoor) {
            System.out.println("We passed the third door!");
            doorCount += 1;
        }
        if (doorCount == 3){
            passedAllDoors = true;
        }

        if (passedAllDoors) {
            System.out.println("Congratulations you won the program!");
        }
    }
}
