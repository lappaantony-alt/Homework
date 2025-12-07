package Lesson_41_comparator;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldCompareCarsByYear() {
        //given
        Car olderCar = new Car("VW", 2013, 8200, 1.6);
        Car newerCar = new Car("Ford", 2019, 11800, 1.5);

        //when & then
        assertTrue(newerCar.compareTo(olderCar) < 0);
    }

    @Test
    void shouldCompareCarsByPrice() {
        //given
        CarPriceComparator comparator = new CarPriceComparator();

        //when
        Car cheaperCar = new Car("VW", 2013, 8200, 1.6);
        Car moreExpensiveCar = new Car("Ford", 2019, 11800, 1.5);

        //then
        assertTrue(comparator.compare(cheaperCar, moreExpensiveCar) < 0);
    }

    @Test
    void shouldCompareCarsByEngineCapacity() {
        //given
        Car vw = new Car("VW", 2013, 8200, 1.6);
        Car ford = new Car("Ford", 2019, 11800, 1.5);

        Set<Car> cars = new TreeSet<>(
                (car1, car2) -> Double.compare(vw.getEngineCapacity(), ford.getEngineCapacity()));


        //when
        cars.add(vw);
        cars.add(ford);

        //then
        Car smallestEngineCar = cars.iterator().next();
        assertEquals("VW", smallestEngineCar.getBrand());
    }
}