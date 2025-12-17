package lesson_39_functional_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    void shouldBeTrueWhenNumberIsSimple() {
        //given
        List<Integer> numbers = List.of(2, 3, 5, 7, 11);

        //when & then
        for (int number : numbers) {
            Assertions.assertTrue(Main2.isNumberSimple.test(number));
        }
    }

    @Test
    void shouldPrintNumbersFromZeroToMax() {
        // given
        int max = 13;

        // when & then
        Assertions.assertDoesNotThrow(() -> Main2.randomNumber.accept(max));
    }

    @Test
    void shouldReturnRandomDayOfTheWeek() {
        //gvien
        List<String> week = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

        //when
        String result = Main2.randomDayOfWeek.get();

        //then
        Assertions.assertTrue(week.contains(result));
    }

    @Test
    void shouldRoundDoubleToLong() {
        //given
        Function<Double, Long> doubleToLong = value -> Math.round(value);

        // when & then
        Assertions.assertEquals(5L, doubleToLong.apply(5.2));
    }

    @Test
    void shouldReturnCorrectFibonacciNumberByIndex() {
        //given
        long number = 10L;

        //when
        long result = Main2.fibonacci.apply(number);

        //then
        Assertions.assertEquals(55L, result);
    }
}