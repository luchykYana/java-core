package homework_2.Task_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Cтворити клас ланцюг наслідування:
//        Папірус-Кинга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

        Book book = new Book("20x30","genre", "title", "author");
        Book book2 = new Magazine("20x30","genre2", "title2", "author2", "topic2");
        Book book3 = new Comics("15x20","genre3", "title3", "author3", 10);

        ArrayList<Book> books = new ArrayList<>();

        books.add(book);
        books.add(book2);
        books.add(book3);

        for (var item:books) {
            item.name();
            System.out.println(item.getSize());
            item.type();
        }
    }
}
