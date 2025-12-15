package chap13java2;

import java.util.List;
import java.util.ArrayList;

public class ReverseList {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");

        List<String> reversedWords = reverseList(words);
        System.out.println(reversedWords);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<Integer> reversedNums = reverseList(nums);
        System.out.println(reversedNums);
    }

    public static <T> List<T> reverseList(List<T> list) {

        List<T> result = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }

        return result;
    }
}
