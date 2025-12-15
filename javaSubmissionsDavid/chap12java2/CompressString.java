package chap12java2;

public class CompressString {

    public static void main(String[] args) {
        System.out.println("aaabbc -> " + compress("aaabbc"));
    }

    public static String compress(String s) {
        // Base case: empty
        if (s.isEmpty()) return "";

        // 1. Identify character and count occurrences
        char first = s.charAt(0);
        int count = 1;
        
        // Advance while next char matches
        while (count < s.length() && s.charAt(count) == first) {
            count++;
        }

        // 2. Return char + count + recurse on the rest
        return first + String.valueOf(count) + compress(s.substring(count));
    }
}