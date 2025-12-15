package chap12java2;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println("hello: " + count("hello"));
        System.out.println("banana: " + count("banana"));
    }

    public static int count(String s) {
        // Base case: empty
        if (s.isEmpty()) return 0;

        // Check first char
        char c = Character.toLowerCase(s.charAt(0));
        int val = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        // Recurse rest
        return val + count(s.substring(1));
    }
}