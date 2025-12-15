package chap12java2;

public class SumDigitsString {

    public static void main(String[] args) {
        System.out.println("2025 -> " + sum("2025"));
    }

    public static int sum(String s) {
        // Base case: empty
        if (s.isEmpty()) return 0;

        // Convert char to int ('2' -> 2)
        int val = Character.getNumericValue(s.charAt(0));

        // Recurse rest
        return val + sum(s.substring(1));
    }
}