package lesson_28;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);

        Shape chosenShape = null;

        System.out.println("Chose one of 3 shapes from list: \nCircle \nRectangle \nSquare");
        String shape = scan.nextLine();

        if (shape.equalsIgnoreCase("Circle")) {
            System.out.println("Enter the radius of circle:");
            double radius = scan.nextDouble();
            chosenShape = new Circle(radius);
            Circle chosenCircle = new Circle(radius);
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            System.out.println("Enter the width of Rectangle:");
            double width = scan.nextDouble();
            System.out.println("Enter the height of Rectangle:");
            double height = scan.nextDouble();
            chosenShape = new Rectangle(width, height);
        } else if (shape.equalsIgnoreCase("Square")) {
            System.out.println("Enter the side of Square:");
            double side = scan.nextDouble();
            chosenShape = new Square(side);
        }
        else {
            System.out.println("In my world this shape not exist😛");
            return;
        }
        System.out.println("Chose one of 3 option you would to get: \nArea \nPerimeter \nBoth");
        scan.nextLine();
        String option = scan.nextLine();

        if (option.equalsIgnoreCase("Area")) {
            System.out.println("Area: " + chosenShape.calculateArea());
        } else if (option.equalsIgnoreCase("Perimeter")) {
            System.out.println("Perimeter: " + chosenShape.calculatePerimeter());
        } else if (option.equalsIgnoreCase("Both")) {
            chosenShape.displayInfo();
        } else {
            System.out.println("Bad option, try 1 more time😤");
        }
    }
}
