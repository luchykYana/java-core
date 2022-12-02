package homework_4;

import homework_4.enums.Models;
import homework_4.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Models model;
    private int year;
    private int power;

    public Car(String s, int year, int power) {
        if (Objects.equals(s.toUpperCase(), String.valueOf(Models.TOYOTA))) {
            model = Models.TOYOTA;
        } else {
            model = Models.AUDI;
        }
        this.year = year;
        this.power = power;
    }
}
