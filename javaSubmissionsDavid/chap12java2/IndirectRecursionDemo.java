package chap12java2;

import java.util.Scanner;

public class IndirectRecursionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        System.out.println("\n--- Start Recursion ---");
        methodA(num);
        
        input.close();
    }

    // First Method
    public static void methodA(int n) {
        if (n > 0) {
            System.out.println("Method A displays: " + n);
            // Pass n-1 to Method B
            methodB(n - 1);
        }
    }

    // Second Method
    public static void methodB(int n) {
        if (n > 0) {
            System.out.println("Method B displays: " + n);
            // Pass n-1 back to Method A
            methodA(n - 1);
        }
    }
}