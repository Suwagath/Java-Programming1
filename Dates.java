import java.util.Random;

public class Dates {
    public static void main(String[] args){
        Random Dice = new Random();
        int number;

        for(int counter = 1; counter<=10; counter++){
            number = 1+Dice.nextInt(6);
            System.out.println(number + "  ");
        }
    }
}
