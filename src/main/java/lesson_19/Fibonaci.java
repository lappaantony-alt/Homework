package lesson_19;

public class Fibonaci {
//    public static int getFibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 1;
//        } else {
//            return getFibonacci(n - 1) + getFibonacci(n - 2);
//        }
//    }

    public static long getFibonacci(int n) {
        long previous = 0;
        long current = 1;


        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        for (int number = 2; number <= n; number++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

}
