package homework_1;

import java.util.ArrayList;
import java.util.List;

public class UserHelper {
    public static User createUser() {

        return new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                "1-770-736-8031 x56442",
                "hildegard.org",
                new Address(
                        "Kulas Light",
                        "Apt. 556",
                        "Gwenborough",
                        "92998-3874",
                        new Geo("-37.3159", "81.1496" )
                ),
                new Company(
                        "Romaguera-Crona",
                        "Multi-layered client-server neural-net",
                        "harness real-time e-markets"
                ),
                new ArrayList<>(List.of(new Post[]{
                        new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                                "quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto",
                                new Comment[]{
                                        new Comment(
                                                1,
                                                1,
                                                "id labore ex et quam laborum",
                                                "Eliseo@gardner.biz",
                                                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"
                                        ),
                                        new Comment(
                                                1,
                                                2,
                                                "quo vero reiciendis velit similique earum",
                                                "Jayne_Kuhic@sydney.com",
                                                "est natus enim nihil est dolore omnis voluptatem numquam et omnis occaecati quod ullam at voluptatem error expedita pariatur nihil sint nostrum voluptatem reiciendis et"
                                        )
                                }),
                        new Post(1, 2, "qui est esse", "est rerum tempore vitae sequi sint nihil reprehenderit dolor beatae ea dolores neque fugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis qui aperiam non debitis possimus qui neque nisi nulla",
                                new Comment[]{
                                        new Comment(
                                                2,
                                                6,
                                                "et fugit eligendi deleniti quidem qui sint nihil autem",
                                                "Presley.Mueller@myrl.com",
                                                "doloribus at sed quis culpa deserunt consectetur qui praesentium accusamus fugiat dicta voluptatem rerum ut voluptate autem voluptatem repellendus aspernatur dolorem in"
                                        )}
                        ),
                })));
    }
}
