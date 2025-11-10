package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

class TableThread extends Thread {
    private int num;

    TableThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("\n--- Multiplication Table of " + num + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class DivisorThread extends Thread {
    private int num;

    DivisorThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("\n--- Divisors of " + num + " ---");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class Experiment_8_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        TableThread table = new TableThread(num);
        DivisorThread divisor = new DivisorThread(num);

        table.start();
        divisor.start();

        sc.close();
    }
}
