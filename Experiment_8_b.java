package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

class EvenThread extends Thread {
    private int[] arr;

    EvenThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        System.out.println("\n--- Even Numbers ---");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class OddThread extends Thread {
    private int[] arr;

    OddThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        System.out.println("\n--- Odd Numbers ---");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class Experiment_8_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        EvenThread even = new EvenThread(arr);
        OddThread odd = new OddThread(arr);

        even.start();
        odd.start();

        sc.close();
    }
}

