package lesson_28;

import lombok.Getter;

@Getter

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public void displayInfo() {
        System.out.println("Rectangle");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }

}
