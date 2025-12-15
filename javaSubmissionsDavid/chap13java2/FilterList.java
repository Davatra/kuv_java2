package chap13java2;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterList {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(12);

        ArrayList<Integer> evens = filterList(nums, n -> n % 2 == 0);
        System.out.println(evens);

        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("elephant");
        words.add("dog");

        ArrayList<String> longWords =
                filterList(words, w -> w.length() > 3);
        System.out.println(longWords);
    }

    public static <T> ArrayList<T> filterList(List<T> list, Predicate<T> p) {

        ArrayList<T> result = new ArrayList<>();

        for (T item : list) {
            if (p.test(item)) {
                result.add(item);
            }
        }

        return result;
    }
}
