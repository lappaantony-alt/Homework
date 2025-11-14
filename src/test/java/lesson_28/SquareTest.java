package lesson_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testArea() {
        //given
        Square square = new Square(11);

        //when
        double area = square.calculateArea();

        //then
        Assertions.assertEquals(121, area);
    }

    @Test
    void testPerimeter() {
        //given
        Square square = new Square(11);

        //when
        double perimeter = square.calculatePerimeter();

        //then
        Assertions.assertEquals(44, perimeter);
    }
}