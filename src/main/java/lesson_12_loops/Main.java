package lesson_12_loops;

public class Main {

    static void main() {

        int[] arr = {-30, -10, 0, 5, 20};

        // for (ініціалізація; умова; перехід на наступне значення - інкремент/декремент)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

        // Написати програму що виводить тільки додатні елементи масиву
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }

        }

        System.out.println("");


        // Написати програму що робить усі від’ємні елементи масиву додатніми
        // і збільшує їх удвічі (застосовуючи елвіс оператор).

        // for each example
        for (int element : arr) {

            if (element < 0) {
                element = element * -2;
            }

            System.out.print(element + " ");
        }

        System.out.println();

        // simple for example
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                arr[i] = arr[i] * -2;
            }

            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Приклад з ++");

        // difference between ++i and i++
        int i = 0;

        while (i < 3) {
            System.out.print(i++ + " ");
        }
        System.out.println();

        int j = 0;

        while (j < 3) {
            System.out.print(++j + " ");
        }

    }


}