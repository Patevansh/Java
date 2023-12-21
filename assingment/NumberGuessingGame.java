package assingment;
import java.util.Random;
import java.util.Scanner;

public class
NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Try to guess the number between 1 and 100.");

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    break;
                }
            }
        }
    }
}

