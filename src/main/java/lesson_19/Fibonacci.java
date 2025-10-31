package lesson_19;

public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
