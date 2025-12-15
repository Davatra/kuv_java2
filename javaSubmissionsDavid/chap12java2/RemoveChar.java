package chap12java2;

public class RemoveChar {

    public static void main(String[] args) {
        System.out.println("banana, remove 'a' -> " + remove("banana", 'a'));
    }

    public static String remove(String s, char c) {
        // Base case: empty
        if (s.isEmpty()) return "";

        // Check first
        char first = s.charAt(0);

        // Recurse: skip if match, else keep
        return (first == c ? "" : first) + remove(s.substring(1), c);
    }
}