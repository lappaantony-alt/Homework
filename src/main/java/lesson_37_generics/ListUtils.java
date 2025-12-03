package lesson_37_generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtils {
    public static <T> List<T> removeDuplicatesFromList(List<T> numbers) {
        List<T> result = new ArrayList<>();
        Set<T> addedNumbers = new HashSet<>();

        for (T number : numbers) {
            if (!addedNumbers.contains(number)) {
                addedNumbers.add(number);
                result.add(number);
            }
        }
        return result;
    }
}
