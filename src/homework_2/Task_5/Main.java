package homework_2.Task_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Є об'єкти постів:
//        Є об'єкти коментарів до цих постів
//        Запакувати всі пости в список,всі коментарі в свій окремий список
//        Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
//
//        В постах додатково потрібно додати поле яке характеризує список комментарів.

        ArrayList<Post> posts = new ArrayList<>();
        ArrayList<Comment> comments = new ArrayList<>();

        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 2, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 3, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto"));

        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 3, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(2, 7, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(2, 8, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(3, 13, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(3, 14, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));
        comments.add(new Comment(3, 15, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium"));

        for (var post : posts) {
            for (var comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.getComments().add(comment);
                }
            }
        }

        for (var post : posts) {
            System.out.println("Post #" + post.getId());
            for (var comment : post.getComments()) {
                System.out.println("\tComment #" + comment.getId());
            }
        }
    }
}
