package lesson_35;

import java.util.*;

public class WordUtils {
    public static String getShortestWord(List<String> words) {

        int shortestWordLength = Integer.MAX_VALUE;
        String shortestWord = "";

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength < shortestWordLength) {
                shortestWordLength = wordLength;
                shortestWord = word;
            }
        }
        return shortestWord;
    }


    public static Set<String> getUniqueWordsFromSentence(String sentence) {
        String[] words = sentence.split(" ");

        return new HashSet<>(List.of(words));
    }


    public static List<String> getDuplicatesFromSentence(String sentence) {
        String[] words = sentence.split(" ");

        Set<String> unique = new HashSet<>();
        Set<String> duplicates = new HashSet<>();


        for (String word : words) {
            if (unique.contains(word)) {
                duplicates.add(word);
            } else {
                unique.add(word);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static Map<String, Integer> countWordsFrequency(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            int current = wordCount.getOrDefault(word, 0);
            int next = current + 1;
            wordCount.put(word, next);
        }
        return wordCount;
    }

}