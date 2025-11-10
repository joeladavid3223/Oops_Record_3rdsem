package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

public class Experiment_1_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double BASE_PRICE = 200.0;

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter day of booking (e.g., Monday): ");
        String day = sc.nextLine().trim().toLowerCase();

        double price = BASE_PRICE;

        if (age < 5) {
            price = 0;
        } else if (age >= 5 && age <= 18) {
            price = BASE_PRICE * 0.6; // 40% discount
        } else if (age > 60) {
            price = BASE_PRICE * 0.7; // 30% discount
        }

        // Weekday additional 10% discount
        if (day.startsWith("mon") || day.startsWith("tue") || day.startsWith("wed") ||
            day.startsWith("thu") || day.startsWith("fri")) {
            price = price * 0.9;
        }

        System.out.println("Final Ticket Price: ₹" + price);
        sc.close();
    }
}

