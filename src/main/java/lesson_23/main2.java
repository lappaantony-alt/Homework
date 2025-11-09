package lesson_23;

import java.util.HashMap;

public class main2 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romanNumbers.get(s.charAt(i));
            int next = (i+1 <s.length()) ? romanNumbers.get(s.charAt(i+1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }

        }


        System.out.println("MIX");
        return result;
    }
}

                // варіант 2
//class Solution {
//    public int romanToInt(String s) {
//        // Мапінг символів A..Z у значення (цікаві лише I,V,X,L,C,D,M)
//        int[] map = new int[26];
//        map['I' - 'A'] = 1;
//        map['V' - 'A'] = 5;
//        map['X' - 'A'] = 10;
//        map['L' - 'A'] = 50;
//        map['C' - 'A'] = 100;
//        map['D' - 'A'] = 500;
//        map['M' - 'A'] = 1000;
//
//        int res = 0;
//        int prev = 0; // значення попереднього (праворуч) символу
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int cur = map[s.charAt(i) - 'A'];
//            if (cur < prev) {
//                res -= cur;     // менше за правий → віднімаємо
//            } else {
//                res += cur;     // інакше додаємо
//            }
//            prev = cur;
//        }
//
//        return res;
//    }
//}


            // Варіант 3 (топ)
//class Solution {
//    public int romanToInt(String s) {
//        int res = 0;
//        int prev = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int cur = 0;
//
//            switch (s.charAt(i)) {
//                case 'I': cur = 1; break;
//                case 'V': cur = 5; break;
//                case 'X': cur = 10; break;
//                case 'L': cur = 50; break;
//                case 'C': cur = 100; break;
//                case 'D': cur = 500; break;
//                case 'M': cur = 1000; break;
//            }
//
//            if (cur < prev) {
//                res -= cur;
//            } else {
//                res += cur;
//            }
//
//            prev = cur;
//        }
//
//        return res;
//    }
//}