import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String [] args) {

        // Set up maximum number of guesses
        int MAX = 4;

        // Set up count for number of guesses
        int guessCount = 0;

        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the number to guess
        int numberToGuess = 1 + (int)(10 * Math.random());

        System.out.println("Welcome to the number guess game");

        while (true) {

            // Ask the user for their guess
            System.out.print("Please guess the number (1 to 10): ");
            int guess = sc.nextInt();
            if (guess == -1) {
                // cheat mode
                System.out.printf("the number to guess is %d\n", numberToGuess);
                continue;
            }

            guessCount++;

            if (guess == numberToGuess) {
                System.out.println("Well done you won!");
                System.out.printf("You took %d goes to complete the game\n", guessCount);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Sorry wrong number\n" +
                        "Your guess was lower than the number");
            } else {
                System.out.println("Sorry wrong number\n" +
                        "Your guess was higher than the number");
            }

            if (guessCount == MAX) {
                System.out.println("Maximum number of guesses reached - Game Over!");
                break;
            }

        }

        System.out.println("Game Over!");

    }

}
