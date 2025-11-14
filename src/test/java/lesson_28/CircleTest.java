package lesson_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testArea() {
        //given
        Circle circle = new Circle(13);

        //when
        double area = circle.calculateArea();

        //then
        Assertions.assertEquals(530.929158456675, area);
    }

    @Test
    void testPerimeter() {
        //gifen
        Circle circle = new Circle(21);

        //when
        double perimeter = circle.calculatePerimeter();

        //then
        Assertions.assertEquals(131.94689145077132, perimeter);
    }

}