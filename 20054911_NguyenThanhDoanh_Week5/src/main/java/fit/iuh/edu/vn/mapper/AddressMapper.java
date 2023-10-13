package fit.iuh.edu.vn.mapper;

import com.neovisionaries.i18n.CountryCode;
import fit.iuh.edu.vn.dataTo.AddressDto;
import fit.iuh.edu.vn.entities.Address;

public class AddressMapper {
    public static AddressDto mapToAddressDTo(Address address){
        AddressDto addressDto = AddressDto.builder()
                .id(address.getId())
                .city(address.getCity())
                .street(address.getStreet())
                .number(address.getNumber())
                .zipcode(address.getZipcode())
                .country(address.getCountry())
                .build();
return addressDto;
    }

    public static Address mapToClub(AddressDto addressDto) {
        Address address = Address.builder()
                .id(addressDto.getId())
                .city(addressDto.getCity())
                .street(addressDto.getStreet())
                .number(addressDto.getNumber())
                .zipcode(addressDto.getZipcode())
                .country(addressDto.getCountry())
                .build();
        return  address;
    }
}
