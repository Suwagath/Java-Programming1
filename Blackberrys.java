import java.util.Scanner;

public class Blackberrys {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Tuba TubaObject = new Tuba ();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        TubaObject.simpleMessage(name);

    }
}
