package lesson_35;

import lesson_19.Fibonaci;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static long getSumFib(List<Integer> numbers) {
        long sum = 0;

        for (Integer number : numbers) {
            int fibonacciValue = Fibonaci.getFibonacci(number);
            sum += fibonacciValue;
        }
        return sum;
    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                int multipliedNumber = number * 2;
                result.add(multipliedNumber);
            }
        }
        return result;

    }

}
