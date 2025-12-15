package chap12java2;

public class CountUppercase {

    public static void main(String[] args) {
        System.out.println("HelloWorld -> " + count("HelloWorld"));
    }

    public static int count(String s) {
        // Base case: empty
        if (s.isEmpty()) return 0;

        // Check first
        int val = Character.isUpperCase(s.charAt(0)) ? 1 : 0;

        // Recurse rest
        return val + count(s.substring(1));
    }
}