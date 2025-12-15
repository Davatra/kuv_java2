package chap13java2;

import java.util.List;
import java.util.ArrayList;

public class FindIndex {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");

        System.out.println(findIndex(words, "banana"));
        System.out.println(findIndex(words, "grape"));

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(findIndex(nums, 20));
        System.out.println(findIndex(nums, 40));
    }

    public static <T> int findIndex(List<T> list, T target) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }
}

