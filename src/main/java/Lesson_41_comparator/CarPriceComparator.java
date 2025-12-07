package Lesson_41_comparator;

import java.sql.Driver;
import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car vwCar, Car fordCar) {
        return Integer.compare(vwCar.getCarPrice(), fordCar.getCarPrice());
    }
}
