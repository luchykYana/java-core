package homework_2.Task_4;

import homework_2.Task_4.enums.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Models model;
    private int year;
    private int power;
}
