package chap12java2;

import java.util.Scanner;

public class AddingRecursively {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowVal, highVal;

        // 1. Prompt for the first integer
        System.out.print("Enter the first integer (lower limit): ");
        lowVal = input.nextInt();

        // 2. Prompt for the second integer with validation loop
        // The second integer must be strictly larger than the first.
        do {
            System.out.print("Enter the second integer (must be larger than " + lowVal + "): ");
            highVal = input.nextInt();

            if (highVal <= lowVal) {
                System.out.println("Error: The second integer must be larger than the first.");
            }
        } while (highVal <= lowVal);

        // 3. Call the recursive method and display the result
        int result = sumRecursively(lowVal, highVal);
        System.out.println("The sum of numbers between " + lowVal + " and " + highVal + " is: " + result);
        
        input.close();
    }

    /**
     * Recursive method to sum integers between low and high.
     * Logic: Adds current 'high' to the sum of the range (low, high-1).
     * * @param low  The fixed lower bound.
     * @param high The current upper bound (decrements with each call).
     * @return The sum of integers.
     */
    public static int sumRecursively(int low, int high) {
        // Base Case: If the high value is no longer greater than the low value,
        // we have reached the bottom of the range. Return the low value itself.
        if (high <= low) {
            return low;
        }
        
        // Recursive Step: Add the current high value to the result of 
        // the method called with one less than the current high value.
        return high + sumRecursively(low, high - 1);
    }
}