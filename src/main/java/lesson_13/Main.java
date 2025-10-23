package lesson_13;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введи кількість елментів які повинні бути в массиві та натисни Enter");
        int arrayLength = scan.nextInt();

        int[] arr = new int[arrayLength];

        for (int a = 0; a < arrayLength; a++) {
            System.out.println("Введи елемент № " + (a + 1) + " та натисни Enter");
            arr[a] = scan.nextInt();
        }

        int choice;

        do {
            System.out.println("     Меню:");
            System.out.println("1 - Cума чисел");
            System.out.println("2 - Cередне всіх чисел");
            System.out.println("3 - Найбільше число");
            System.out.println("4 - Завершити програму");
            System.out.println("Твій вибір ");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int a = 0; a < arrayLength; a++) {
                        sum += arr[a];
                    }
                    System.out.println("Сума всіх чисел: " + sum);
                    break;

                case 2:
                    int sum1 = 0;
                    for (int a = 0; a < arrayLength; a++) {
                        sum1 += arr[a];
                    }
                    double avrg = (double) sum1 / arrayLength;
                    System.out.println("Cередне всіх чисел: " + avrg);
                    break;

                case 3:
                    int maxNum = arr[0];
                    for (int a = 1; a < arrayLength; a++) {
                        if (arr[a] > maxNum) {
                            maxNum = arr[a];
                        }
                    }
                    System.out.println("Найбільше число: " + maxNum);
                    break;

                case 4:
                    System.out.println("Програму завершено, будьте здорові");
                    break;

                default:
                    System.out.println("Ну в меню ж написано тільки 4 пункти, ну ти даєш, давай ще раз");
            }

        } while (choice != 4);

    }
}
