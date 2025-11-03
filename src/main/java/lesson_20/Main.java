package lesson_20;

import java.time.YearMonth;
import java.util.Scanner;

public class Main {
    static void main() {
        Automobile car = new Automobile();

//        car.setFuelLvl(30);
//        car.setFuelConsumption(5.4);
//        car.setTufDate(YearMonth.of(2025, 11));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть склільки літрів пального залишилось: ");
        int fuel = scan.nextInt();
        car.setFuelLvl(fuel);
        System.out.println("Введіть витрату пального в літрах на 100км: ");
        double fuel1 = scan.nextDouble();
        car.setFuelConsumption(fuel1);
        System.out.println("Введіть рік та місяць наступного техогляду");
        int year = scan.nextInt();
        int month = scan.nextInt();
        YearMonth tuf = YearMonth.of(year, month);
        car.setTufDate(tuf);



        car.carCanDrive();
        car.carAllowedToDrive();
        car.carAllowedToDrive();

        System.out.println("Авто може їхати: " + car.carCanDrive());
        System.out.println("TUF дійсний: " + car.carAllowedToDrive());
        System.out.println("Авто може проїхати: " + car.howFarCarCanDrive() + "км");
    }
}
