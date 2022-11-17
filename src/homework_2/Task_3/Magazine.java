package homework_2.Task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine extends Book{
    private String topic;

    public Magazine(String size, String genre, String title, String author, String topic) {
        super(size, genre, title, author);
        this.topic = topic;
    }

    @Override
    public void name() {
        super.name();
    }
}
