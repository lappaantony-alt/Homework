package lesson_37_generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    @Test
    void shouldRemoveDuplicatesFromList() {
        //given
        List<Integer> numbers = List.of(11, 23, 43, 55, 55, 11, 74, 63, 7, 13, 23);

        //when
        List<Integer> result = ListUtils.removeDuplicatesFromList(numbers);

        //then
        Assertions.assertEquals(List.of(11, 23, 43, 55, 74, 63, 7, 13), result);
    }
}
