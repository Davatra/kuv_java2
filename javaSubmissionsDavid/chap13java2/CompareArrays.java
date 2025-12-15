package chap13java2;

public class CompareArrays {

    public static void main(String[] args) {

        Integer[] a1 = {1, 2, 3, 4};
        Integer[] a2 = {1, 2, 3, 4};
        Integer[] a3 = {4, 3, 2, 1};

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(arraysEqual(a1, a2));
        System.out.println(arraysEqual(a1, a3));
        System.out.println(arraysEqual(s1, s2));
    }

    public static <T> boolean arraysEqual(T[] x, T[] y) {

        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i]))
                return false;
        }

        return true;
    }
}
