package Lesson_41_comparator;

import java.util.*;


public class Main {

    static void main() {
        Car vw = new Car("VW", 2023, 30500, 2.0);
        Car ford = new Car("Ford", 2025, 31500, 1.5);

        List<Car> cars = new ArrayList<>();
        cars.add(vw);
        cars.add(ford);

        Collections.sort(cars);
        System.out.println("Sorting cars by newness: " + cars);

        Collections.sort(cars, new CarPriceComparator());
        System.out.println("Sorting cars by price: " + cars);

        Set<Car> carSortedByEngineCapacity = new TreeSet<>(
                (car1, car2) -> Double.compare(vw.getEngineCapacity(), ford.getEngineCapacity())
        );
        carSortedByEngineCapacity.add(vw);
        carSortedByEngineCapacity.add(ford);

        System.out.println("Sorting cars by biggest engine capacity: " + carSortedByEngineCapacity);
    }
}
