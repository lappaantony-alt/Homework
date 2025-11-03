package lesson_20;

import lombok.*;

import java.time.YearMonth;

@Data
@NoArgsConstructor
@Setter
@Getter

public class Automobile {

    private int fuelLvl;
    private double fuelConsumption;
    private YearMonth tufDate;

    public boolean carCanDrive() {
        if (fuelLvl > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean carAllowedToDrive() {
        if (tufDate.isBefore(YearMonth.now()) || tufDate.equals(YearMonth.now())) {
            return true;
        } else {
            return false;
        }
    }

    public double howFarCarCanDrive() {
        if (fuelLvl <= 0) {
            return 0;
        }
        return fuelLvl / fuelConsumption * 100;
    }
}



