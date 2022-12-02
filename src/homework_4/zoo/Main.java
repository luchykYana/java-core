package homework_4.zoo;

import homework_4.db.Database;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//        Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

        List<Member> members = Database.getClubMembers();
        List<Pet> pets = Database.getPets();

        ZooClub zooClub = new ZooClub();

        members.forEach(zooClub::addClubMember);
        zooClub.print();

        zooClub.addPetToClubMember(1, pets.get(0));
        zooClub.addPetToClubMember(2, pets.get(2));
        zooClub.addPetToClubMember(2, pets.get(1));
        zooClub.print();

        zooClub.deletePetFromClubMember(pets.get(1), members.get(1));
        zooClub.print();

        zooClub.deleteClubMember(members.get(0));
        zooClub.print();
    }
}
