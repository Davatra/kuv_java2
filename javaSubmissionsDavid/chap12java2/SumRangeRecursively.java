package chap12java2;

import java.util.Scanner;

public class SumRangeRecursively {

    public static void main(String[] args) {
        // Init array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                         11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        Scanner input = new Scanner(System.in);
        int start = -1, end = -1;
        int max = numbers.length - 1;

        System.out.println("Array indices: 0 - " + max);

        // Get start
        while (true) {
            System.out.print("Enter start (0-" + max + "): ");
            if (input.hasNextInt()) {
                start = input.nextInt();
                if (start >= 0 && start <= max) break;
            } else input.next();
            System.out.println("Invalid start.");
        }

        // Get end
        while (true) {
            System.out.print("Enter end (" + start + "-" + max + "): ");
            if (input.hasNextInt()) {
                end = input.nextInt();
                if (end >= start && end <= max) break;
            } else input.next();
            System.out.println("Invalid end.");
        }

        // Show range
        System.out.print("Values: ");
        for (int i = start; i <= end; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        // Calc sum
        int total = sumRecursively(numbers, start, end);
        System.out.println("\nSum: " + total);
        
        input.close();
    }

    // Recursive sum
    public static int sumRecursively(int[] arr, int start, int end) {
        // Base case
        if (start > end) return 0;

        // Recursive step
        return arr[start] + sumRecursively(arr, start + 1, end);
    }
}