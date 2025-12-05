package lesson_39_functional_interface;

import java.util.ArrayList;
import java.util.function.*;

public class Main {
    static void main() {
        Predicate<Integer> isNumberNegative = x -> x < 0;
        System.out.println(isNumberNegative.test(-2));
        System.out.println(isNumberNegative.test(6));


        Consumer<String> catWithNiceLook = x -> System.out.println("Sweety cat " + x);
        catWithNiceLook.accept("(=^･ω･^=)");


        Supplier<Integer> dice = () -> {
            int value = (int) (Math.random() * 6) + 1;
            return value;
        };
        System.out.println("🎲" + dice.get());


        Function<Integer, String> replacement = x -> String.valueOf(x);
        System.out.println("String: " + replacement.apply(13));

        Function<String, String> catToRacoon = catName -> catName + " the racoon";
        System.out.println(catToRacoon.apply("Barsik"));


        UnaryOperator<Long> factorialOfNumber = x -> {
            if (x == 0) {
                return 1L;
            }
            long result = 1;
            for (long i = 1; i <= x; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Factorial of the Number: " + factorialOfNumber.apply(7L));

        UnaryOperator<Double> rootOfNumber = x -> Math.sqrt(x);
        System.out.println("Square root of number: " + rootOfNumber.apply(7.6));

    }

    static void main(String[] args) {
        Supplier<String> error = () -> {
            throw new NullPointerException();
        };
        System.out.println(error.get());
    }
}
