package homework_2.Task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Paper{
    private String genre;
    private String title;
    private String author;

    public Book(String size, String genre, String title, String author) {
        super(size);
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    public void name() {
        System.out.println(genre + ": " + title + " (" + author + ")");
    }

    @Override
    void type() {
        System.out.println("Book");
    }

    @Override
    public String getSize() {
        return super.getSize();
    }
}
