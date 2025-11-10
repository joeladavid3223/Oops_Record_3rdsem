package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

public class Experiment_3_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the paragraph: ");
        String paragraph = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();

        // Convert both to lowercase to make the search case-insensitive
        String[] words = paragraph.toLowerCase().split("\\W+"); // split by non-word characters
        String searchWord = word.toLowerCase();

        int count = 0;
        for (String w : words) {
            if (w.equals(searchWord)) {
                count++;
            }
        }

        System.out.println("The given word '" + word + "' is found " + count + " times");

        sc.close();
    }
}
