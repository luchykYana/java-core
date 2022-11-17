package homework_2.Task_1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User<ID, COORDINATE> {
    ID id;
    String name;
    String username;
    String email;
    Address<COORDINATE> address;
    String phone;
    String website;
    Company company;

    public User(ID id, String name, String username, String email, String street, String suite, String city,
                String zipcode, COORDINATE lat, COORDINATE lng, String phone, String website, String companyName,
                String catchPhrase, String bs) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.address = new Address<>(street, suite, city, zipcode, lat, lng);
        this.company = new Company(companyName, catchPhrase, bs);
    }

    public static class Builder {
        private final User<String, String> user = new User<>();

        public Builder setId(String id) {
            user.id = id;
            return this;
        }

        public Builder setName(String name) {
            user.name = name;
            return this;
        }

        public Builder setUsername(String username) {
            user.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            user.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public Builder setWebsite(String website) {
            user.website = website;
            return this;
        }

        public Builder setAddress(Address<String> address) {
            user.address = address;
            return this;
        }

        public Builder setCompany(Company company) {
            user.company = company;
            return this;
        }

        public User<String, String> build() {
            return user;
        }
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
