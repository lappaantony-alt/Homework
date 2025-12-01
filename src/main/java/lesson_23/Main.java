package lesson_23;

public class Main {


    public static int lengthOfLastWordRegex(String s) {
        s = s.trim();
        return s.replaceAll(".*\\b(\\w+)\\W*$", "$1").length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWordRegex("Hello World"));
        System.out.println(lengthOfLastWordRegex(" fly me to the moon "));
        System.out.println(lengthOfLastWordRegex("Luffy is still joyboy"));

    }

    // Варіант через
    //lastiIndexOf()


    public static int lengthOfLastWordIndex(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            return s.length();
        }

        return s.length() - lastSpaceIndex - 1;
    }


//    Варіант 3
//    цикл з
//    кінця рядка
//    той який
//    краще запамʼятати.


    public static int lengthOfLastWordWordLoop(String s) {
        s = s.trim();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            count++;
        }
        return count;
    }

}