import java.util.*;
import java.lang.*;

public class Numbergame {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int number = num.nextInt(100) + 1;
        int i;
        System.out.println("You have only 10 attempts:");
        for (i = 10; i >= 1; i--) {
            System.out.println("Enter the Your Number between 1 to 100");
            int guessnum = sc.nextInt();
            if (guessnum == number) {
                System.out.println("Your Number is Correct");
                System.out.println("You Scored " + i + 0 + " Marks");
                break;
            } else if (guessnum > number && i > 1) {
                System.out.println("Your number is higher then the guess number");
            } else if (guessnum < number && i > 1) {
                System.out.println("Your number is lower then the guess number");
            }

        }
        if (i < 1) {
            System.out.println("Your no of attempts is over:");
            System.out.println("You Scored 0 Marks");

        }
    }

}
