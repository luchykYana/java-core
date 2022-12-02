package homework_4.db;

import com.mongodb.ConnectionString;
import com.mongodb.client.*;
import com.mongodb.client.model.Projections;
import homework_4.Car;
import homework_4.Person;
import homework_4.Skill;
import homework_4.enums.Gender;
import homework_4.zoo.Member;
import homework_4.zoo.Pet;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.*;

public class Database {
    private static MongoCollection<Document> connect(String table) {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
        MongoClient mongoClient = MongoClients.create(connectionString);

        MongoDatabase database = mongoClient.getDatabase("java-core");

        return database.getCollection(table);
    }

    public static List<Person> getUsers() {
        MongoCollection<Document> collection = connect("users");

        Bson projectionFields = Projections.fields(
                Projections.include("id", "name", "surname", "email", "age", "gender", "skills", "car"),
                Projections.excludeId());

        FindIterable<Document> projection = collection.find().projection(projectionFields);

        List<Person> users = new ArrayList<>();

        for (int i = 0; i < collection.countDocuments(); i++) {
            users.add(new Person());
        }

        MongoCursor<Document> iterator = projection.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Document next = iterator.next();
            users.get(i).setId(next.getInteger("id"));
            users.get(i).setName(next.getString("name"));
            users.get(i).setSurname(next.getString("surname"));
            users.get(i).setEmail(next.getString("email"));
            users.get(i).setAge(next.getInteger("age"));

            if (String.valueOf(next.get("gender")).equals(String.valueOf(Gender.MALE))) {
                users.get(i).setGender(Gender.MALE);
            } else {
                users.get(i).setGender(Gender.FEMALE);
            }

            List<Object> skills = (List<Object>) next.get("skills");
            ArrayList<Skill> userSkills = new ArrayList<>();

            for (Object o : skills) {
                String[] split = o.toString().replace("Document{{", "").replace("}}", "").split("[=, ]");
                userSkills.add(new Skill(split[1], Integer.valueOf(split[4])));
            }

            users.get(i).setSkills(userSkills);

            Object car = next.get("car");
            String[] splitCar = car.toString().replace("Document{{", "").replace("}}", "").split("[=, ]");
            users.get(i).setCar(new Car(splitCar[1], Integer.parseInt(splitCar[4]), Integer.parseInt(splitCar[7])));

            i++;
        }

        return users;
    }

    public static List<Member> getClubMembers() {
        MongoCollection<Document> collection = connect("club_members");

        Bson projectionFields = Projections.fields(
                Projections.include("id", "name", "surname"),
                Projections.excludeId());

        FindIterable<Document> projection = collection.find().projection(projectionFields);

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < collection.countDocuments(); i++) {
            members.add(new Member());
        }

        MongoCursor<Document> iterator = projection.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Document next = iterator.next();
            members.get(i).setId(next.getInteger("id"));
            members.get(i).setName(next.getString("name"));
            members.get(i).setSurname(next.getString("surname"));

            i++;
        }

        return members;
    }

    public static List<Pet> getPets() {
        MongoCollection<Document> collection = connect("pets");

        Bson projectionFields = Projections.fields(
                Projections.include("id", "name"),
                Projections.excludeId());

        FindIterable<Document> projection = collection.find().projection(projectionFields);

        List<Pet> pets = new ArrayList<>();

        for (int i = 0; i < collection.countDocuments(); i++) {
            pets.add(new Pet());
        }

        MongoCursor<Document> iterator = projection.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            Document next = iterator.next();
            pets.get(i).setId(next.getInteger("id"));
            pets.get(i).setName(next.getString("name"));

            i++;
        }

        return pets;
    }
}
