package chap13java2;

import java.util.List;
import java.util.ArrayList;

public class MergeLists {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");

        List<String> merged = mergeLists(list1, list2);
        System.out.println(merged);
    }

    public static <T> List<T> mergeLists(List<T> a, List<T> b) {

        List<T> result = new ArrayList<>();
        int max = Math.max(a.size(), b.size());

        for (int i = 0; i < max; i++) {
            if (i < a.size())
                result.add(a.get(i));
            if (i < b.size())
                result.add(b.get(i));
        }

        return result;
    }
}
