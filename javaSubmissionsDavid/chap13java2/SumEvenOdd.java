package chap13java2;

import java.util.List;
import java.util.ArrayList;

public class SumEvenOdd {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(7);
        nums.add(10);
        nums.add(12);

        sumEvenOdd(nums);
    }

    public static <T extends Number> void sumEvenOdd(List<T> list) {

        int evenSum = 0;
        int oddSum = 0;

        for (T n : list) {
            int value = n.intValue();

            if (value % 2 == 0)
                evenSum += value;
            else
                oddSum += value;
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }
}
