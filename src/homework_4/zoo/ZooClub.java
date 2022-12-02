package homework_4.zoo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZooClub {
    private Map<Member, List<Pet>> club = new LinkedHashMap<>();

    public void addClubMember(Member person) {
        club.put(person, new ArrayList<>());
    }

    public void addPetToClubMember(int personID, Pet pet) {
        Member foundPerson = club.keySet().stream().filter(person -> person.getId() == personID).toList().get(0);

        club.get(foundPerson).add(pet);
    }

    public void deletePetFromClubMember(Pet pet, Member person) {
        club.get(person).removeIf(p -> p.equals(pet));
    }

    public void deleteClubMember(Member person) {
        club.remove(person);
    }

    public void deletePet(Pet pet) {
        club.entrySet()
                .forEach(personPetsList -> personPetsList
                        .setValue(personPetsList
                                .getValue()
                                .stream()
                                .filter(pet1 -> !pet1.equals(pet))
                                .toList()));
    }

    public void print() {
        club.entrySet().forEach(System.out::println);
        System.out.println("********************");
    }
}
