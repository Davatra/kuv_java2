package chap12java2;

import java.util.Scanner;

public class ProductionGoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initial values
        double currentProduction = 1000.0;
        double growthRate = 0.06; // 6%

        // Get goal
        System.out.print("Enter production goal: ");
        double goal = input.nextDouble();

        // Check goal
        if (goal <= currentProduction) {
            System.out.println("The goal has already been met.");
        } else {
            // Start recursion from Month 0
            int monthsNeeded = calcMonths(0, currentProduction, growthRate, goal);
            System.out.println("Goal reached in " + monthsNeeded + " months.");
        }
        
        input.close();
    }

    // Recursive projection
    public static int calcMonths(int month, double current, double rate, double target) {
        // Base case: Target reached
        if (current >= target) {
            return month;
        }

        // Recursive step: Next month, grow production
        return calcMonths(month + 1, current * (1 + rate), rate, target);
    }
}