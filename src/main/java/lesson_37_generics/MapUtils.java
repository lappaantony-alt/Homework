package lesson_37_generics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapUtils {
    public static <K> Map<K, Integer> combinedMap(Map<K, Integer> map1,
                                                  Map<K, Integer> map2) {
        Map<K, Integer> result = new LinkedHashMap<>(map1);

        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(),
                    (resultValue, newValue) -> resultValue + newValue);
        }
        return result;
    }
}