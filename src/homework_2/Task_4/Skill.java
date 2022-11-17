package homework_2.Task_4;

import homework_2.Task_4.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    Skills name;
    int exp;
}
