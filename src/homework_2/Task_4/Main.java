package homework_2.Task_4;

import homework_2.Task_4.enums.Gender;
import homework_2.Task_4.enums.Models;
import homework_2.Task_4.enums.Skills;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        new Person(1, "name", "surname", "email", 31, Gender.MALE,
                new ArrayList<>(List.of(new Skill[]{
                        new Skill(Skills.JAVA, 10),
                        new Skill(Skills.JS, 6)})
                ),
                new ArrayList<>(List.of(new Car[]{
                        new Car(Models.TOYOTA, 2010, 250),
                        new Car(Models.TOYOTA, 2006, 200)}))
                );
    }
}
