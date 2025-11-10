package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

class WordThread implements Runnable {
    private String text;

    WordThread(String text) {
        this.text = text;
    }

    public void run() {
        String[] words = text.split("\\s+");
        System.out.println("\n--- Word Thread ---");
        for (String word : words) {
            System.out.println(word);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class VowelThread implements Runnable {
    private String text;

    VowelThread(String text) {
        this.text = text;
    }

    public void run() {
        System.out.println("\n--- Vowel Thread ---");
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.println(c);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class Experiment_8_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph of text: ");
        String text = sc.nextLine();

        Thread wordThread = new Thread(new WordThread(text));
        Thread vowelThread = new Thread(new VowelThread(text));

        wordThread.start();
        vowelThread.start();

        sc.close();
    }
}
