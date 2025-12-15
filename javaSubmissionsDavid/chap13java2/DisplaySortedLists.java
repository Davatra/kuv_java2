package chap13java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DisplaySortedLists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();   // strings
        ArrayList<Integer> nums = new ArrayList<>();   // integers

        System.out.print("Enter word (quit to stop): ");
        String word = sc.nextLine();

        while (!word.equalsIgnoreCase("quit")) {
            words.add(word);
            Collections.sort(words);
            display(words);

            System.out.print("Enter word (quit to stop): ");
            word = sc.nextLine();
        }

        System.out.print("Enter number (-1 to stop): ");
        int num = sc.nextInt();

        while (num != -1) {
            nums.add(num);
            Collections.sort(nums);
            display(nums);

            System.out.print("Enter number (-1 to stop): ");
            num = sc.nextInt();
        }

        sc.close();
    }

    public static <T> void display(ArrayList<T> list) { // display
        System.out.println(list);
    }
}
