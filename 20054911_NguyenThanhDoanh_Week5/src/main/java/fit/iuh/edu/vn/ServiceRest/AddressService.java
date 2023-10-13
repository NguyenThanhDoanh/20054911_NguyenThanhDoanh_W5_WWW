package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Address;
import fit.iuh.edu.vn.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService  {
 private  final AddressRepository addressRepository;
    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public List<Address> saveAll(List<Address> addresss) {
        return addressRepository.saveAll(addresss);
    }

    public Address save(Address entity) {
        return addressRepository.save(entity);
    }

    public Optional findById(Long id) {
        return addressRepository.findById(id);
    }

    public void deleteById(Long id) {addressRepository.deleteById(id);}

    public void delete(Address entity) {addressRepository.delete(entity);}

}
