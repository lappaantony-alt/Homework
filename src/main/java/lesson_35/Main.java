package lesson_35;

import lesson_35.Word_Utils;

import java.util.*;

public class Main {
    static void main() {
        Word_Utils wordUtils = new Word_Utils();

        List<String> words = new ArrayList<>();

        words.add("The");
        words.add("Mykola");
        words.add("ate");
        words.add("an");
        words.add("apple");

        words.add("apple");

        String shortestWord = wordUtils.getShortestWord(words);

        String sentence = "Mykola ate a cucumber and a tomato and a carrot";

        Set<String> uniqueWords = wordUtils.getUniqueWordsFromSentence(sentence);

        List<String> duplicates = wordUtils.getDuplicatesFromSentence(sentence);

        Map<String, Integer> Frequency = wordUtils.countWordsFrequency(sentence);

        System.out.println("Shortest word: " + shortestWord);
        System.out.println(uniqueWords);
        System.out.println(duplicates);
        System.out.println(Frequency);
    }

    public static void main(String[] args) {
        Number_Utils numberUtils = new Number_Utils();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers you want to add");

        int count = scanner.nextInt();
        List<Integer> numbersList = new ArrayList<>();

        for (int index = 0; index < count; index++) {
            System.out.println("Enter the numbers");
            int fibonacciIndex = scanner.nextInt();
            numbersList.add(fibonacciIndex);
        }

        Long sum = numberUtils.getSumFib(numbersList);
        System.out.println("Sum: " + sum);

        List<Integer> multiplied = Number_Utils.multiplyOddNumber(numbersList);

        System.out.println("Multiplied odd numbers from list: " + multiplied);


    }
}
