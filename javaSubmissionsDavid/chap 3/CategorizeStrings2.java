package chap3java2;

import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings2 {
    public static void main(String[] args) {
        // Init lists
        ArrayList<String> noSpaceList = new ArrayList<>();
        ArrayList<String> oneSpaceList = new ArrayList<>();
        ArrayList<String> moreSpaceList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        final int MAX_ENTRIES = 20;
        final String ENTRY_TERMINATOR = "QUIT";
        final String OUTPUT_SENTINEL = "EXIT";
        String userInput;
        int count = 0;

        // Data Entry
        System.out.println("--- DATA ENTRY ---");
        System.out.println("Enter string or '" + ENTRY_TERMINATOR + "' to stop.");
        System.out.println("Max " + MAX_ENTRIES + " entries.");

        while (count < MAX_ENTRIES) {
            System.out.print("Entry " + (count + 1) + ": ");
            userInput = input.nextLine();

            // Check quit
            if (userInput.equalsIgnoreCase(ENTRY_TERMINATOR)) {
                break;
            }

            // Count spaces
            int spaces = 0;
            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) == ' ') {
                    spaces++;
                }
            }

            // Sort input
            if (spaces == 0) {
                noSpaceList.add(userInput);
            } else if (spaces == 1) {
                oneSpaceList.add(userInput);
            } else {
                moreSpaceList.add(userInput);
            }

            count++;
        }

        // Display Loop
        System.out.println("\n--- DISPLAY RESULTS ---");
        
        while (true) {
            System.out.print("\nEnter category ('none', 'one', 'more') or '" + OUTPUT_SENTINEL + "' to quit.");
            System.out.print("\n(Any other key shows ALL): ");
            String choice = input.nextLine();

            // Check exit
            if (choice.equalsIgnoreCase(OUTPUT_SENTINEL)) {
                System.out.println("Goodbye!");
                break;
            }

            // Show lists
            if (choice.equalsIgnoreCase("none")) {
                displayList(noSpaceList, "No Spaces");
            } else if (choice.equalsIgnoreCase("one")) {
                displayList(oneSpaceList, "One Space");
            } else if (choice.equalsIgnoreCase("more")) {
                displayList(moreSpaceList, "More than One Space");
            } else {
                // Invalid choice -> Show All
                System.out.println(">> Displaying ALL lists:");
                displayList(noSpaceList, "No Spaces");
                displayList(oneSpaceList, "One Space");
                displayList(moreSpaceList, "More than One Space");
            }
        }
        
        input.close();
    }

    // Print helper
    public static void displayList(ArrayList<String> list, String label) {
        System.out.println("--> " + label + ":");
        if (list.isEmpty()) {
            System.out.println("    [Empty]");
        } else {
            for (String item : list) {
                System.out.println("    " + item);
            }
        }
    }
}