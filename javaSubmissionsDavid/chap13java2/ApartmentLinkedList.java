package chap13java2;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class ApartmentLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Apartment> list = new LinkedList<>();

        System.out.print("Enter street address (quit to stop): ");
        String address = sc.nextLine();

        while (!address.equalsIgnoreCase("quit")) {

            System.out.print("Apartment number: ");
            int apt = sc.nextInt();

            System.out.print("Monthly rent: ");
            double rent = sc.nextDouble();

            System.out.print("Bedrooms: ");
            int beds = sc.nextInt();
            sc.nextLine();

            list.add(new Apartment(address, apt, rent, beds));

            System.out.print("\nEnter street address (quit to stop): ");
            address = sc.nextLine();
        }

        Collections.sort(list);

        System.out.println("\nApartments:");
        for (Apartment a : list) {
            System.out.println(a);
        }

        sc.close();
    }
}
