package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

public class Experiment_1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] units = new int[12];
        int total = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter electricity usage for month " + (i + 1) + ": ");
            units[i] = sc.nextInt();
            total += units[i];
        }

        double average = total / 12.0;
        System.out.println("Total usage: " + total + " units");
        System.out.println("Average monthly usage: " + average + " units");

        if (average > 500) {
            System.out.println("High Consumption Alert!");
        }

        sc.close();
    }
}

