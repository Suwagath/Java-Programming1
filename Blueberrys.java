import java.util.Scanner;

public class Blueberrys {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Buta ButaObject = new Buta();
        System.out.println("Enter Name of first gf here: ");
        String temp = input.nextLine();
        ButaObject.setName(temp);
        ButaObject.saying();


    }
}

