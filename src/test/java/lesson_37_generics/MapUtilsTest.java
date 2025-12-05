package lesson_37_generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapUtilsTest {

    @Test
    void shouldSumValuesWhenKeysMatch() {
        //given
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 2);
        map2.put("b", 5);

        //when
        Map<String, Integer> merged = MapUtils.combinedMap(map1, map2);

        //then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        expected.put("c", 3);
        expected.put("b", 5);

        Assertions.assertEquals(expected, merged);

    }
}