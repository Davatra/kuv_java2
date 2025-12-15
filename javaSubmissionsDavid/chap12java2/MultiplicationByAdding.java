package chap12java2;

import java.util.Scanner;

public class MultiplicationByAdding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        int result = multiplyRecursively(num1, num2);
        
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
        
        input.close();
    }

    /**
     * Recursive method to multiply two integers using repeated addition.
     * Logic: a * b is equivalent to b + (a-1) * b
     */
    public static int multiplyRecursively(int count, int value) {
        // Base Case: Anything multiplied by 0 is 0.
        if (count == 0) {
            return 0;
        }
        
        // Handling Negative Inputs:
        // If the counter is negative, we flip the sign of the result
        // and recurse with a positive counter.
        // e.g., -4 * 6 becomes -(4 * 6)
        if (count < 0) {
            return -multiplyRecursively(-count, value);
        }

        // Recursive Step:
        // Add 'value' to the result of the function called with 'count - 1'
        return value + multiplyRecursively(count - 1, value);
    }
}