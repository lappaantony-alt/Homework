package lesson11;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner console = new Scanner(System.in);

        System.out.println("Введи день тижня");
        String day = console.nextLine().toLowerCase();

        switch (day) {
            case "понеділок":
                System.out.println("1");
                break;
            case "вівторок":
                System.out.println("2");
                break;
            case "середа":
                System.out.println("3");
                break;
            case "четвер":
                System.out.println("4");
                break;
            case "п'ятниця":
                System.out.println("5");
                break;
            case "субота":
                System.out.println("6");
                break;
            case "неділя":
                System.out.println("7");
                break;
            default:
                System.out.println("Невідомий день тижня");

        }
    }
}
