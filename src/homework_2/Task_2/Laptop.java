package homework_2.Task_2;

import homework_2.Task_2.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends PC {
    private float weight;
    private float screen;

    public Laptop(String name, Type type, String processor, float weight, float screen) {
        super(name, type, processor);
        this.weight = weight;
        this.screen = screen;
    }

    @Override
    public void work() {
        System.out.println("Laptop work!");
    }
}
