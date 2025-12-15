package chap12java2;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("abcd -> " + reverse("abcd"));
    }

    public static String reverse(String s) {
        // Base case: empty
        if (s.isEmpty()) return s;

        // Recurse: rest + first
        return reverse(s.substring(1)) + s.charAt(0);
    }
}