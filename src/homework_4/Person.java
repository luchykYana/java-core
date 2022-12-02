package homework_4;

import homework_4.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

    @Override
    public int compareTo(Person o) {
        if(this.skills.size() - o.skills.size() > 0) {
            return 1;
        } else if (this.skills.size() - o.skills.size() < 0) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
