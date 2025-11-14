package lesson_28;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getWidth();
    }

    @Override
    public void displayInfo() {
        System.out.println("Square");
        System.out.println("Side A: " + getWidth());
        System.out.println("Side B: " + getHeight());
        System.out.println("Area of square: " + calculateArea());
        System.out.println("Perimeter of square: " + calculatePerimeter());
    }
}
