package oopsRecordPrograms_3rdSem;

import java.util.Random;
import java.util.Scanner;

public class Experiment_1_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too High!");
            } else if (guess < numberToGuess) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct Guess!");
            }

        } while (guess != numberToGuess);

        sc.close();
    }
}
