package lesson10;

public class Main {

    static void main() {
        int x = 1;

        if (x == 1) {
            System.out.println("Так, x це 1");
        } else if (x == 2) {
            System.out.println("Так, x це 2");
        } else {
            System.out.println("Ну, ніяка умова не спрацювала... x це " + x);
        }

        int y = 4;

        if (y % 2 == 0) {
            System.out.println("😎");

            if (y == 4){
                System.out.println("🥸");
            }
        }

        boolean жінки = true;
        boolean неодружені = true;

        if (жінки && неодружені){
            System.out.println("🔥");
        } else {
            System.out.println("🥲");
        }


        int arr [] = {5, 10, 20};

        if (arr[0] % 2 == 0) {
            System.out.println("Елемент з індексом 0 є парним");
        }

        // ?:
        // ? - if
        // : - else
        int result = (arr[0] % 2 == 0) ? 2 : 1;
        System.out.println(result);

    }
}