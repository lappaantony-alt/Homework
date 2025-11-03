package lesson_20;

import java.time.YearMonth;

public class Main {
    static void main() {
        Automobile car = new Automobile();

        car.setFuelLvl(30);
        car.setFuelConsumption(5.4);
        car.setTufDate(YearMonth.of(2025, 11));

        car.carCanDrive();
        car.carAllowedToDrive();
        car.carAllowedToDrive();

        System.out.println("Авто може їхати: " + car.carCanDrive());
        System.out.println("TUF дійсний: " + car.carAllowedToDrive());
        System.out.println("Авто може проїхати: " + car.howFarCarCanDrive() + "км");
    }
}
