package lesson11;

public class Main {
    static void main() {

        int day = 2;
        String name;
        int number;
        String month = "X";

        switch (day) {
            case 1 -> {
                name = "понеділок";
                number = 20;
            }
            case 2 -> {
                name = "вівторок";
                number = 21;
            }
            case 3 -> {
                name = "середа";
                number = 20;
            }
            case 4 ->  {
                name = "четвер";
                number = 21;
            }
            case 5 -> {
                name = "пʼятниця";
                number = 22;
            }
            case 6 -> {
                name = "субота";
                number = 23;
            }
            case 7 -> {
                name = "неділя";
                number = 24;
            }
            default -> {
                  name = "невідомий день";
                  number = 0;
            }
        };

        System.out.println(name + " " + number + "." + month);
    }
}
