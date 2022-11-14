package homework_1;

public class Main {
    public static void main(String[] args) {
        //створила юзера
        User user = UserHelper.createUser();
        System.out.println(user);

        //подивилася яка у нього пошта, поміняла, подивилась чи поміняло
        System.out.println(user.getEmail());
        user.setEmail("testemail@gmail.com");
        System.out.println(user.getEmail());

        //подивилася який текст у першому коментарі першого поста уього юзера, поміняла, подивилась чи поміняло
        System.out.println(user.getPosts().get(0).getComments()[0].getBody());
        user.getPosts().get(0).getComments()[0].setBody("Hello");
        System.out.println(user.getPosts().get(0).getComments()[0].getBody());

        //проітерувала пости, вивела інфу
        for (var post:user.getPosts()) {
            System.out.println("Post: " + post.getUserId() + "." + post.getId() + ". " + post.getTitle());

            //проітерувала коменти, вивела інфу, якщо айді поста 2 вивела повідомлення
            for (var comment:post.getComments()) {
                System.out.println("Comment: " + comment.getPostId() + "." + comment.getId() + ". " + comment.getBody());
                if (comment.getPostId() == 2) {
                    System.out.println("This comment is for post 2");
                }
            }
            System.out.println("----------------");
        }
    }
}
