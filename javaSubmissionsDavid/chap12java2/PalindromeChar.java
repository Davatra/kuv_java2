package chap12java2;

public class PalindromeChar {

    public static void main(String[] args) {
        System.out.println("racecar: " + isPalindrome("racecar"));
        System.out.println("hello: " + isPalindrome("hello"));
    }

    public static boolean isPalindrome(String s) {
        // Base case: 0 or 1 char
        if (s.length() <= 1) return true;

        // Check ends
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;

        // Recurse middle
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}