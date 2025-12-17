package lesson_37_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    static void main() {
        ListUtils listUtils = new ListUtils();

        String originalListOfNumbers = "11, 23, 34, 11, 22, 43, 34, 73, 25, 14, 11";

        List<Integer> newListOfNumbers = new ArrayList<>();

        String[] parts = originalListOfNumbers.split(",");

        for (String part : parts) {
            int number = Integer.parseInt(part.trim());
            newListOfNumbers.add(number);
        }

        List<Integer> listWithoutDuplicates = listUtils.removeDuplicatesFromList(newListOfNumbers);

        System.out.println("New list without duplicates: " + listWithoutDuplicates);
    }

    static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();

        map1.put("I", 0);
        map1.put("can", 1);
        map1.put("say", 1);
        map1.put("it", 2);
        map1.put("was", 3);
        map1.put("really", 5);
        map1.put("difficult", 8);

        map2.put("But", 13);
        map2.put("I", 21);
        map2.put("really", 34);
        map2.put("handle", 55);
        map2.put("it", 89);
        map2.put("God bless", 144);
        map2.put("GPT😂", 233);

        Map<String, Integer> merged = MapUtils.combinedMap(map1, map2);

        System.out.println(merged);
    }
}
