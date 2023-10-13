package fit.iuh.edu.vn.service;

import fit.iuh.edu.vn.dataTo.AddressDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AddressService {
    public List<AddressDto> getAllAddress();
    public AddressDto getAddress();

}
