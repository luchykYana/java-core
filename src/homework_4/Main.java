package homework_4;

import homework_4.db.Database;
import homework_4.enums.Gender;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//      Створити List Юзерів
        List<Person> users = Database.getUsers();

//      - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
        users.sort(Comparator.comparingInt(Person::getAge));
        users.forEach(System.out::println);

        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        users.forEach(System.out::println);

//      - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        users.forEach(System.out::println);

        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        users.forEach(System.out::println);

//      створити ArrayList зі словами на 15-20 елементів.
        ArrayList<String> words = new ArrayList<>(List.of(new String[]{"grenadine", "hefty", "gladiolus", "concretize", "manikin", "canvass", "lubbrly", "cordial", "tamp"}));

//      - відсортувати його за алфавітом .
        words.sort(String::compareTo);
        words.forEach(System.out::println);

//        Створити клас котрий відповідає наступній моделі
//        {
//            id: 1,
//                    name: 'vasya',
//                surname: 'pupkin',
//                email: 'asd@asd.com',
//                age: 31,
//                gender: 'MALE',
//                skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//            car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків

        List<Person> personList = Database.getUsers();
//        HashSet<Person> hashSet = new HashSet<>(personList);
//        hashSet.forEach(System.out::println);

//        Iterator<Person> iterator = hashSet.iterator();
//
//        while (iterator.hasNext()) {
//            Person next =  iterator.next();
//            if(next.getGender().equals(Gender.MALE)){
//                iterator.remove();
//            }
//
//        }
//        hashSet.removeIf(next -> next.getGender().equals(Gender.MALE));
//        hashSet.forEach(System.out::println);

//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
        TreeSet<Person> treeSet = new TreeSet<>(personList);
        treeSet.forEach(System.out::println);
    }
}
