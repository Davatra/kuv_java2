package chap12java2;

public class ReplaceChar {

    public static void main(String[] args) {
        System.out.println("apple, 'p' -> 'x': " + replace("apple", 'p', 'x'));
    }

    public static String replace(String s, char oldChar, char newChar) {
        // Base case: empty
        if (s.isEmpty()) return "";

        // Check first
        char first = s.charAt(0);
        
        // Use newChar if match, else keep first
        char toAdd = (first == oldChar) ? newChar : first;

        // Recurse rest
        return toAdd + replace(s.substring(1), oldChar, newChar);
    }
}
