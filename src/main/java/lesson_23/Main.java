public class Main {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.replaceAll(".*\\b(\\w+)\\W*$", "$1").length();
    }

public static void main(String[] args) {
    System.out.println(lengthOfLastWord("Hello World"));
    System.out.println(lengthOfLastWord(" fly me to the moon "));
    System.out.println(lengthOfLastWord("Luffy is still joyboy"));
}
}

     // Варіант через lastiIndexOf()
//public class Main {
//    public static int lengthOfLastWord(String s) {
//        s = s.trim();
//        int lastSpaceIndex = s.lastIndexOf(' ');
//
//        if (lastSpaceIndex == -1) {
//            return s.length();
//        }
//
//        return s.length() - lastSpaceIndex - 1;
//    }
//}


   // Варіант 3 цикл з кінця рядка  той який краще запамʼятати.
//public class Main {
//    public static int lengthOfLastWord(String s) {
//        s = s.trim();
//        int count = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ') break;
//            count++;
//        }
//        return count;
//    }
//}