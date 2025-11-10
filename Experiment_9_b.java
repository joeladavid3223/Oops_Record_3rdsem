package oopsRecordPrograms_3rdSem;

import java.io.*;
import java.util.*;

public class Experiment_9_b {
    public static void main(String[] args) {
        String inputFile = "inventory.txt";
        String outputFile = "low_stock_alert.txt";

        try {
            Scanner sc = new Scanner(new File(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));

            writer.println("====== LOW STOCK ALERT REPORT ======");
            writer.println(String.format("%-20s %-10s %-10s", "Product Name", "Stock", "Price"));
            writer.println("-----------------------------------------------");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int stock = Integer.parseInt(parts[1].trim());
                    double price = Double.parseDouble(parts[2].trim());

                    if (stock < 5) {
                        writer.println(String.format("%-20s %-10d %-10.2f", name, stock, price));
                    }
                }
            }

            writer.println("===============================================");
            writer.close();
            sc.close();

            System.out.println("Low stock report generated in " + outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
