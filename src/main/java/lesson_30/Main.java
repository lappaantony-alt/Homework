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
                stack.addElement(element);
            }
            if (choice == 2) {
                Integer remove = stack.takeOutElement();
                if (remove != null) {
                    System.out.println("Removed " + remove);
                }
            }
            if (choice == 3) {
                Integer topElement = stack.readTop();
                if (topElement != null) {
                    System.out.println("Top element: " + topElement);
                }
            }
            if (choice == 4) {
                boolean result = stack.isEmpty();
                System.out.println("Stack is empty:" + result);
            }
            if (choice == 5) {
                boolean result = stack.isFull();
                System.out.println("Stack is full:" + result);
            }
            if (choice == 6) {
                stack.printStack();
            }
            if (choice == 7) {
                stack.clear();
                System.out.println("Stack cleared");
            }
        }
    }
}
