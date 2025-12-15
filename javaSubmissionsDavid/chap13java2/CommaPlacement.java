package chap13java2;

import java.util.ArrayList;
import java.util.Scanner;

public class CommaPlacement {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String text;
        final String SENTINEL = "STOP";

        // Get inputs
        System.out.println("Enter words (type STOP to finish):");
        while (true) {
            text = input.nextLine();
            if (text.equals(SENTINEL)) break;
            words.add(text);
        }

        // Display
        System.out.print("\nResult: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i));
            // Comma for all except last, period for last
            if (i < words.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        input.close();
    }
}