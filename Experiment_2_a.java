package oopsRecordPrograms_3rdSem;

import java.util.Scanner;

public class Experiment_2_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers (space-separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The indices are " + i + ", " + j);
                    System.out.println("Because nums[" + i + "] + nums[" + j + "] = " 
                                       + nums[i] + " + " + nums[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No two numbers add up to the target.");
        }
        sc.close();
    }
}
