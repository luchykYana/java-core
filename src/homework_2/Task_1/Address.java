package homework_2.Task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address<COORDINATE> {
    String street;
    String suite;
    String city;
    String zipcode;
    Geo<COORDINATE> geo;

    public Address(String street, String suite, String city, String zipcode, COORDINATE lat, COORDINATE lng) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = new Geo<>(lat, lng);
    }
}
