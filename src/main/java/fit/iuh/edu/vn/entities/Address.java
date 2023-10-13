package fit.iuh.edu.vn.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;


@Entity
@EqualsAndHashCode(of={"id"})
@Table(name="address")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;

    private String city;

    private String street;
    private String number;

    private String zipcode;

    private CountryCode country;



    public Address( String city, String street, String number, String zipcode, CountryCode country) {

        this.city = city;
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.country = country;

    }
}
