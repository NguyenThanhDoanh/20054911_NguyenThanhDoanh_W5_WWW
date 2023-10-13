package fit.iuh.edu.vn.dataTo;

import com.neovisionaries.i18n.CountryCode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDto {
    private long id;
    private String city;
    private String street;
    private String number;
    private String zipcode;
    private CountryCode country;
}
