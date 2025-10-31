package lesson_19;

public class MyMath {

    // мін з двох чисел
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    // макс з двох чисел
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // абсолютне значення числа
    public static double abs(double a) {
        if (a < 0) {
            a = a * (-1);
            return a;
        } else {
            return a;
        }

    }

    // піднесення до степеня
    public static int power(int a, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * a;
        }

        return result;
    }


    // округлення до цілої частини
    public static int round(double a) {
        // 4.3 -> 4
        // 4.7 -> 4
        int result = (int) a;
        return result;
    }

}