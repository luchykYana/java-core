package homework_2.Task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comics extends Book {
    private int numberOfParts;

    public Comics(String size, String genre, String title, String author, int numberOfParts) {
        super(size, genre, title, author);
        this.numberOfParts = numberOfParts;
    }

    @Override
    public void name() {
        super.name();
    }
}
