package chap10java2;

import java.util.Scanner;

public class DemoBlankets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        final String QUIT = "Q";

        // --- PART 1: Standard Blanket ---
        System.out.println("--- STANDARD BLANKET DEMO ---");
        Blanket b = new Blanket();
        System.out.println("Start: " + b.toString());

        while (true) {
            System.out.print("\nEnter Material (or " + QUIT + " to quit): ");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase(QUIT)) break;
            
            b.setMaterial(userInput);
            System.out.println(b.toString());

            System.out.print("Enter Size: ");
            userInput = input.nextLine();
            b.setSize(userInput);
            System.out.println(b.toString());
        }

        // --- PART 2: Electric Blanket ---
        System.out.println("\n--- ELECTRIC BLANKET DEMO ---");
        ElectricBlanket eb = new ElectricBlanket();
        System.out.println("Start: " + eb.toString());

        while (true) {
            // Material
            System.out.print("\nEnter Material (or " + QUIT + " to quit): ");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase(QUIT)) break;
            eb.setMaterial(userInput);
            
            // Size
            System.out.print("Enter Size: ");
            eb.setSize(input.nextLine());
            
            // Heat Settings
            System.out.print("Enter Heat Settings (1-5): ");
            int settings = Integer.parseInt(input.nextLine());
            eb.setHeatSettings(settings);

            // Auto Shutoff
            System.out.print("Has Auto Shutoff? (y/n): ");
            String shutoff = input.nextLine();
            if (shutoff.equalsIgnoreCase("y")) {
                eb.setHasAutoShutoff(true);
            } else {
                eb.setHasAutoShutoff(false);
            }

            // Display
            System.out.println(eb.toString());
        }
        
        input.close();
    }
}