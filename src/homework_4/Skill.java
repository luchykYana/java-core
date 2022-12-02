package homework_4;

import homework_4.enums.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    Skills name;
    int exp;

    public Skill(String s, Integer integer) {
        if (Objects.equals(s.toUpperCase(), String.valueOf(Skills.C))) {
            name = Skills.C;
        } else if (Objects.equals(s.toUpperCase(), String.valueOf(Skills.JS))) {
            name = Skills.JS;
        } else if (Objects.equals(s.toUpperCase(), String.valueOf(Skills.JAVA))) {
            name = Skills.JAVA;
        } else {
            name = Skills.PYTHON;
        }
        exp = integer;
    }
}
