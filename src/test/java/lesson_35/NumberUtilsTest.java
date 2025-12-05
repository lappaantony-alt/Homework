package lesson_35;

import lesson_19.Fibonaci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberUtilsTest {

    @Test
    void shouldShowCorrectFibonacciNumbersByIndex() {
        //given
        int index = 7;

        //when
        int result = Fibonaci.getFibonacci(index);

        //then
        Assertions.assertEquals(13, result);
    }

    @Test
    void shouldShowCorrectSumOfFibonacciNumbers() {
        //given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        //when
        long actual = NumberUtils.getSumFib(numbers);

        //then
        Assertions.assertEquals(12, actual);
    }

    @Test
    void shouldMultiplyOnlyOddNumbers() {
        //given
        List<Integer> Numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> oddNumbers = List.of(2, 6, 10);

        //when
        List<Integer> actual = NumberUtils.multiplyOddNumber(Numbers);

        //then
        Assertions.assertEquals(oddNumbers, actual);
    }
}