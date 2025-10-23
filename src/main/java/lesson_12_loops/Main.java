package lesson_12_loops;

public class Main {
    static void main() {
        int [] arr = {-43, -35, -20, -10, 5, 0, 3, 4, 6, 9, 12, 15, 20, 34, 40, 41, 42};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();
    };

}
