package lesson_20;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.YearMonth;

import static org.junit.jupiter.api.Assertions.*;

class AutomobileTest {

    @Test
    void shouldDrive() {
        //given
        Automobile car = new Automobile();
        car.setFuelLvl(30);

        //when
        boolean result = car.carCanDrive();

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotDrive() {
        //given
        Automobile car = new Automobile();
        car.setFuelLvl(0);

        //when
        boolean result = car.carCanDrive();

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldBeAllowedToDrive() {
        //given
        Automobile car = new Automobile();
        car.setTufDate(YearMonth.of(2026, 1));

        //when
        boolean result = car.carAllowedToDrive();

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldShowHowMuchMoreMonthsTillTuf() {
        //given
        Automobile car = new Automobile();
        car.setTufDate(YearMonth.of(2026, 1));

        //when
        int months = car.monthsTillTufExpired();

        //then
        Assertions.assertEquals(2, months);
    }

    @Test
    void shouldShowCorrectDistanceBasedOnFuel() {
        //given
        Automobile car = new Automobile();
        car.setFuelLvl(30);
        car.setFuelConsumption(5);

        //when
        double result = car.howFarCarCanDrive();

        //then
        Assertions.assertEquals(600, result);
    }

    @Test
    void shouldDriveAtLeast300km() {
        //given
        Automobile car = new Automobile();
        car.setFuelLvl(25);
        car.setFuelConsumption(5);

        //when
        double distance = car.howFarCarCanDrive();

        //then
        Assertions.assertTrue(distance >= 300);
    }
}