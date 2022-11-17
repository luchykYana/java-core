package homework_2.Task_1;

public class Main {
    public static void main(String[] args) {
        //створити клас, який би описував подібні об'єкти
        //https://jsonplaceholder.typicode.com/users/1

        User<Integer, Double> user1 = new User<>(1, "name", "username", "email", "street", "suite",
                "city", "zipcode", -37.3159, 81.1496, "phone", "website",
                "company name", "catch phrase", "bs");
        System.out.println(user1);

        User<String, String> user2 = new User<>("2", "name2", "username2", "email2",
                new Address<>("street2", "suite2", "city2", "zipcode2",
                        new Geo<>("-37.3159", "81.1496")), "phone2", "website2",
                new Company("company name2", "catch phrase2", "bs2"));
        System.out.println(user2);

        // builder lombok
        User<Object, Object> user3 = User.builder().id(3).username("username3").email("email3").phone("phone3").build();
        System.out.println(user3);
        // з дженеріками білдер ломбоку працює лиш з Object, Object;

        // custom builder
        User<String, String> user4 = User.getBuilder().setId("4").setUsername("username4").setEmail("email").setPhone("phone").build();
        System.out.println(user4);
        // з дженеріками кастомний білдер працює лиш з конкретно типами, які задавались юзеру в коді білдера,
        // у даному випадку String, String;
        // Виходить що прийшлось би дублювати код 4 рази (для чотирьох варіацій пар типів) заради одного рядку створення юзера
        // Чи можна ці типи передавати, і якщо ні, то чи існує інший код кастомного білдера, який вирішує цю проблему?
    }
}
