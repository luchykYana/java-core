package homework_2.Task_2;

import homework_2.Task_2.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workstation extends Laptop{
    private String engineeringPurpose;

    public Workstation(String name, Type type, String processor, float weight, float screen, String engineeringPurpose) {
        super(name, type, processor, weight, screen);
        this.engineeringPurpose = engineeringPurpose;
    }

    @Override
    public void work() {
        System.out.println("Workstation work!");
    }
}
