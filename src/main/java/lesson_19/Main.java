package lesson_19;

public class Main {
    static void main() {
        // Використовуємо стандартний джава клас Math
        System.out.println("Використовуємо стандартний джава клас Math");
        // знаходження максимального числа
        int max = Math.max(0, 1);

        // Округлення в більший бік
        double ceiled = Math.ceil(4.3);
        System.out.println(ceiled);

        // Округлення в менший бік
        double floored = Math.floor(4.3);
        System.out.println(floored);

        // Округлення до найближчого цілого
        double rounded1 = Math.round(4.3);
        System.out.println(rounded1);
        double rounded2 = Math.round(4.5);
        System.out.println(rounded2);

        // Використовуємо самописний клас MyMath
        System.out.println("Використовуємо самописний клас MyMath");
        int min = MyMath.min(100, 20);
        System.out.println(min);

        double absed = MyMath.abs(-4.3);
        System.out.println(absed);

        int powered = MyMath.power(2, 3);
        System.out.println(powered);

        int rounded = MyMath.round(4.1);
        System.out.println(rounded);

        int n = 4;
        int fibonacci = Fibonacci.getFibonacci(n);
        System.out.println("Число Фібоначчі для " + n + " = " + (fibonacci));
    }
}
