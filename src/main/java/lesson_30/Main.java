package lesson_30;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Stack size: ");
        int stackSize = scan.nextInt();

        Stackable stack = new StackImpl(stackSize);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Choose action: " +
                    "\n1 - Add element " +
                    "\n2 - Take  out element " +
                    "\n3 - Read top " +
                    "\n4 - Stack is empty? " +
                    "\n5 - Stack is full?  " +
                    "\n6 - Print Stack " +
                    "\n7 - Clear stack " +
                    "\n0 - Exit");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Write a number");
                int element = scan.nextInt();
                try {
                    stack.addElement(element);
                } catch (StackFullException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                try {
                    Integer remove = stack.takeOutElement();
                    System.out.println("Removed " + remove);
                } catch (StackEmptyException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 3) {
                try {
                    Integer topElement = stack.readTop();
                    System.out.println("Top element: " + topElement);
                } catch (StackEmptyException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 4) {
                boolean result = stack.isEmpty();
                System.out.println("Stack is empty:" + result);
            } else if (choice == 5) {
                boolean result = stack.isFull();
                System.out.println("Stack is full:" + result);
            } else if (choice == 6) {
                stack.printStack();
            } else if (choice == 7) {
                stack.clear();
                System.out.println("Stack cleared");
            } else {
                System.out.println("You missed, try one more time");
            }
        }

        scan.close();
        System.out.println("Bye, have a good day!✌️");
    }
}
