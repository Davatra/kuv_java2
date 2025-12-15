package chap12java2;

public class CountChar {

    public static void main(String[] args) {
        System.out.println("banana, 'a' -> " + count("banana", 'a'));
    }

    public static int count(String s, char c) {
        // Base case: empty
        if (s.isEmpty()) return 0;

        // Check first match
        int match = (s.charAt(0) == c) ? 1 : 0;

        // Recurse rest
        return match + count(s.substring(1), c);
    }
}