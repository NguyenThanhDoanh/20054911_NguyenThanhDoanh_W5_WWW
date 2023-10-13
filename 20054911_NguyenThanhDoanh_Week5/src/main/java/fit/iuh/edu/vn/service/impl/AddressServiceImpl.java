package fit.iuh.edu.vn.service.impl;

import fit.iuh.edu.vn.dataTo.AddressDto;
import fit.iuh.edu.vn.entities.Address;
import fit.iuh.edu.vn.mapper.AddressMapper;
import fit.iuh.edu.vn.repository.AddressRepository;
import fit.iuh.edu.vn.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static fit.iuh.edu.vn.mapper.AddressMapper.mapToAddressDTo;
@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressDto> getAllAddress() {
        List<Address> addresses = addressRepository.findAll();
        return addresses.stream().map((address) -> mapToAddressDTo(address)).collect(Collectors.toList());
    }

    @Override
    public AddressDto getAddress() {
        return null;
    }

}
