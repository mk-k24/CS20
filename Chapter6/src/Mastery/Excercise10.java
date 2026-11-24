
package Mastery;
import java.util.Scanner;
import java.util.Random;

public class Excercise10 {

    // Display a hint to the user
    public static void displayHint(int guess, int secretNumber) {
        if (guess > secretNumber) {
            System.out.println("Try a lower number.");
        } else if (guess < secretNumber) {
            System.out.println("Try a higher number.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1;
        int guess;

        System.out.println("Guessing Game");
        System.out.println("Guess a number between 1 and 20.");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("You won!");
            } else {
                displayHint(guess, secretNumber);
            }

        } while (guess != secretNumber);

        input.close();
    }
}
