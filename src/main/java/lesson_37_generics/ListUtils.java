package lesson_37_generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtils {
    public static <T> List<T> removeDuplicatesFromList(List<T> elements) {
        List<T> result = new ArrayList<>();
        Set<T> seenElements = new HashSet<>();

        for (T element : elements) {
            if (!seenElements.contains(element)) {
                seenElements.add(element);
                result.add(element);
            }
        }
        return result;
    }
}
