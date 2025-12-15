package chap12java2;

public class DashInsert {

    public static void main(String[] args) {
        System.out.println("CAT -> " + insert("CAT"));
    }

    public static String insert(String s) {
        // Base case: single char or empty
        if (s.length() <= 1) return s;

        // First + dash + recurse rest
        return s.charAt(0) + "-" + insert(s.substring(1));
    }
}