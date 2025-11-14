package lesson_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        //given
        Shape rectangle = new Rectangle(23, 14);

        //when
        double area = rectangle.calculateArea();

        //then
        Assertions.assertEquals(322, area);
    }

    @Test
    void testPerimeter() {
        //given
        Shape rectangle = new Rectangle(23, 14);

        //when
        double perimeter = rectangle.calculatePerimeter();

        //then
        Assertions.assertEquals(74, perimeter);
    }

}