package chap13java2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        // Setup list
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        // Show list (Iterator)
        System.out.print("List: ");
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("\nRemove: ");
        int val = input.nextInt();

        // Remove value
        // Use Integer.valueOf so it removes the object, not the index
        if (nums.remove(Integer.valueOf(val))) {
            System.out.println("Removed.");
        } else {
            System.out.println("Not found.");
        }

        // Show result
        System.out.println("Result: " + nums);
        input.close();
    }
}