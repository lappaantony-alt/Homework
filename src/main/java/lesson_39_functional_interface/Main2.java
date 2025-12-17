package lesson_39_functional_interface;

import lesson_19.Fibonaci;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main2 {
    public static Predicate<Integer> isNumberPrime = number -> {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    };

    public static Consumer<Integer> randomNumber = max -> {
        for (int number = 0; number <= max; number++) {
            System.out.println(number);
        }
    };

    public static Supplier<String> randomDayOfWeek = () -> {
        List<String> week = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        int dayIndex = (int) (Math.random() * week.size());
        return week.get(dayIndex);
    };

    public static Function<Double, Long> doubleToLong = value -> Math.round(value);

    public static UnaryOperator<Long> fibonacci = number -> (long) Fibonaci.getFibonacci(number.intValue());

    static void main() {
        randomNumber.accept(13);
        System.out.println("Number 7 is prime: " + isNumberPrime.test(7));
        System.out.println("Number 9 is prime: " + isNumberPrime.test(9));
        System.out.println("Day of the week: " + randomDayOfWeek.get());
        System.out.println("Round double to long&: " + doubleToLong.apply(2.4));
        System.out.println("Fibonacci number from 9: " + fibonacci.apply(11L));
    }
}
