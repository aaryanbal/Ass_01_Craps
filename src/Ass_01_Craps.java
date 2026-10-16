import java.util.Random;
import java.util.Scanner;

public class Ass_01_Craps {
    static void main() {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain = "";

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            IO.println("Die 1: " + die1);
            IO.println("Die 2: " + die2);
            IO.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                IO.println("You crapped out! You lose!");
            }
            else if (sum == 7 || sum == 11) {
                IO.println("You got a natural! You win!");
            }
            else {
                int point = sum;
                IO.println("Your point is: " + point);

                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    IO.println("Die 1: " + die1);
                    IO.println("Die 2: " + die2);
                    IO.println("Sum: " + sum);

                    if (sum == point) {
                        IO.println("Made point! You win!");
                    }
                    else if (sum == 7) {
                        IO.println("Got a seven! You lose!");
                    }
                    else {
                        IO.println("Trying for point!");
                    }

                } while (sum != point && sum != 7);
            }

            IO.println("Do you want to play again? [Y or N]: ");
            playAgain = in.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));

        IO.println("Thanks for playing!");
    }
}