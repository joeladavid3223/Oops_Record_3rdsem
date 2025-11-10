package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

public class Experiment_2_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers (space-separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter the number to be searched: ");
        int searchNum = sc.nextInt();

        int count = 0;
        for (int num : nums) {
            if (num == searchNum) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Number Found " + count + " times");
        } else {
            System.out.println("The number not available");
        }
        sc.close();
    }
}

