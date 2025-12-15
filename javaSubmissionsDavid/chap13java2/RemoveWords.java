package chap13java2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveWords {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String text;
        final String QUIT = "STOP";

        // 1. Populate list
        System.out.println("Enter words (" + QUIT + " to finish):");
        while (true) {
            text = input.nextLine();
            if (text.equals(QUIT)) break;
            list.add(text);
        }

        // 2. Display using Iterator
        System.out.print("\nCurrent list: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");

        // 3. Remove loop
        while (true) {
            // Check if empty first
            if (list.isEmpty()) {
                System.out.println("List is empty. Ending program.");
                break;
            }

            System.out.print("Enter word to remove (" + QUIT + " to quit): ");
            text = input.nextLine();

            if (text.equals(QUIT)) break;

            // Try to remove
            if (list.remove(text)) {
                System.out.println("Removed.");
            } else {
                System.out.println("Not found.");
            }

            // Show updated list
            System.out.println("List: " + list);
        }
        
        input.close();
    }
}