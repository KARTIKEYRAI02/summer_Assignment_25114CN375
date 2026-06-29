import java.util.Random;
import java.util.Scanner;
public class Q101 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasWon = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!hasWon) {
            int guess = sc.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                hasWon = true;
                System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
            }
        }
    }
}