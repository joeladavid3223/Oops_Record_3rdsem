package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

public class Experiment_3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int letterCount = 0;
        int digitCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Letters: " + letterCount);
        System.out.println("Digits: " + digitCount);

        sc.close();
    }
}
