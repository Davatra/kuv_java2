package chap12java2;

import java.util.Scanner;

public class FibDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter max value: ");
        int limit = input.nextInt();
        
        System.out.print("Sequence: ");
        int i = 1;
        
        // Loop generation
        while (true) {
            int val = calculateFib(i);
            
            // Stop if value exceeds limit
            if (val > limit) {
                break;
            }
            
            System.out.print(val + " ");
            i++;
        }
        System.out.println();
        input.close();
    }

    // Recursive logic
    public static int calculateFib(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return 1;
        }
        // Recursive step
        return calculateFib(n - 1) + calculateFib(n - 2);
    }
}