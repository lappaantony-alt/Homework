package Lesson_16;

import Lesson_16.animals.Breed;
import Lesson_16.animals.Dragon;

import java.util.Scanner;

public class Main {
    static void main() {

        Dragon viserion = new Dragon();
        viserion.setName("viserion");
        viserion.setAge(7);
        viserion.setWeight(450.45);
        viserion.setColour("Біло-золотий");
        viserion.setLength(25);
        viserion.setBreed(Breed.DINOSAURTYPE);

        System.out.println(viserion);

        Dragon drogon = new Dragon("Drogon", 7, 475.5, Breed.HORSETYPE, "Чорно-червоний", 35);

        System.out.println("Імʼя дракона: " + drogon.getName());
        System.out.println("Вік дракона: " + drogon.getAge() + " років");
        System.out.println("Вага дракона: " + drogon.getWeight() + "кг");
        System.out.println("Порода дракона: " + drogon.getBreed());
        System.out.println("Колір дракона: " + drogon.getColour());
        System.out.println("Довжина дракона: " + drogon.getLength() + "м");



        Scanner scan = new Scanner(System.in);

        System.out.println("Введи скільки хочеш створити драконів, але максимум 3");
        int arrayLength = scan.nextInt();
        scan.nextLine();

        if (arrayLength > 3) {
            System.out.println("Хоч 575 напиши, але максимум буде3 😛");
            arrayLength = 3;
        }

        Dragon[] arr = new Dragon[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = new Dragon();

            System.out.println("Введи імʼя дракона №" + (i + 1) + ":");
            arr[i].setName(scan.nextLine());

            System.out.println("Введи вік дракона:");
            arr[i].setAge(scan.nextInt());

            System.out.println("Введи вагу дракона:");
            arr[i].setWeight(scan.nextDouble());
            scan.nextLine();

            System.out.println("Введи колір дракона:");
            arr[i].setColour(scan.nextLine());

            System.out.println("Введи довжину дракона:");
            arr[i].setLength(scan.nextInt());
            scan.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Дракон №" + (i + 1 + "🔥"));
            System.out.println("Ім’я: " + arr[i].getName());
            System.out.println("Вік: " + arr[i].getAge() + " років");
            System.out.println("Вага: " + arr[i].getWeight() + " кг");
            System.out.println("Колір: " + arr[i].getColour());
            System.out.println("Довжина: " + arr[i].getLength() + " м");
        }

        viserion.voice("🔥🔥🔥🔥🔥🔥🔥🔥");
    }


}


