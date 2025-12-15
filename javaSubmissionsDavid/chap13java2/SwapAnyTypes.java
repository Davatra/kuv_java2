package chap13java2;

import java.util.Scanner;

public class SwapAnyTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        swapValues(s1, s2);

        System.out.print("\nEnter first integer: ");
        Integer i1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        Integer i2 = sc.nextInt();

        swapValues(i1, i2);

        sc.close();
    }

    public static <T> void swapValues(T a, T b) {
        display(a, b);
        T temp = a;
        a = b;
        b = temp;
        display(a, b);
    }

    public static <T> void display(T a, T b) {
        System.out.println(a + "  " + b);
    }
}
