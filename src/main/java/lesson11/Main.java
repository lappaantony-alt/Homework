package lesson11;

public class Main {
    static void main() {

        int day = 3;

        String name = switch (day) {
            case 1 -> "понеділок";
            case 2 -> "вівторок";
            case 3 -> "середа";
            case 4 -> "четверг";
            case 5 -> "пʼятниця";
            case 6 -> "вихідні";
            default -> "невідомий день";
        };

        System.out.println(name);
    }
}
