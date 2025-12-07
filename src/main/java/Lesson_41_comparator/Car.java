package Lesson_41_comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car implements Comparable<Car> {

    private String brand;
    private int yearOfManufacture;
    private int carPrice;
    private double engineCapacity;

    @Override
    public int compareTo(Car otherCar) {

        if (this.yearOfManufacture == otherCar.yearOfManufacture) {
            return Integer.compare(this.carPrice, otherCar.carPrice);
        } else if (this.yearOfManufacture > otherCar.yearOfManufacture) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return brand + ": " + "Year-" + yearOfManufacture + ", price-" + carPrice + "€, engine-" + engineCapacity;

    }
}


