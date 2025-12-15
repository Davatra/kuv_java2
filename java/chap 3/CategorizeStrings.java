package chap3java2;

import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings {
    public static void main(String[] args) {
        // Init vars
        ArrayList<String> shortList = new ArrayList<>();
        ArrayList<String> longList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        final int MAX_ENTRIES = 20;
        final String ENTRY_TERMINATOR = "QUIT";
        final String OUTPUT_SENTINEL = "EXIT";
        String userInput;
        int count = 0;

        // Data Entry
        System.out.println("--- DATA ENTRY ---");
        System.out.println("Enter a string (or type '" + ENTRY_TERMINATOR + "' to stop entry).");
        System.out.println("Maximum " + MAX_ENTRIES + " entries allowed.");

        while (count < MAX_ENTRIES) {
            System.out.print("Entry " + (count + 1) + ": ");
            userInput = input.nextLine();

            // Check quit
            if (userInput.equalsIgnoreCase(ENTRY_TERMINATOR)) {
                break;
            }

            // Categorize input
            if (userInput.length() <= 10) {
                shortList.add(userInput);
            } else {
                longList.add(userInput);
            }

            count++;
        }

        // Display Results
        System.out.println("\n--- DISPLAY RESULTS ---");
        String choice = "";

        // Loop always
        while (true) {
            System.out.print("\nWhich type of string to display? (Enter 'short' or 'long'). ");
            System.out.print("Type '" + OUTPUT_SENTINEL + "' to quit: ");
            choice = input.nextLine();

            // Check exit
            if (choice.equalsIgnoreCase(OUTPUT_SENTINEL)) {
                System.out.println("Goodbye!");
                break;
            }

            // Show list
            if (choice.equalsIgnoreCase("short")) {
                displayList(shortList, "Short Strings (<= 10 chars)");
            } else {
                // Default long
                displayList(longList, "Long Strings (>= 11 chars)");
            }
        }
        
        input.close();
    }

    // Print list
    public static void displayList(ArrayList<String> list, String label) {
        System.out.println("--> " + label + ":");
        
        if (list.isEmpty()) {
            System.out.println("    [The list is empty]");
        } else {
            for (String item : list) {
                System.out.println("    " + item);
            }
        }
    }
}