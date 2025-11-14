package lesson_28;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle");
        System.out.println("Radius of circle: " + radius);
        System.out.println("Area of circle: " + calculateArea());
        System.out.println("Perimeter of circle: " + calculatePerimeter());
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
