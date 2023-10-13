package fit.iuh.edu.vn.restClient;


import fit.iuh.edu.vn.entities.Address;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Optional;


@Service
public class AddressServiceClient {

    private final RestClient restClient;

    public AddressServiceClient() {
        this.restClient = RestClient.builder().baseUrl("http://localhost:8080/api/v1").build();
    }
    public List<Address> getAllAddresses() {
        List<Address> addresses= restClient.get().uri("/address/get").retrieve().body(new ParameterizedTypeReference<List<Address>>(){});

        return  addresses;
    }
    public List<Address> findAlladdress() {
        List<Address> addresses= restClient.get().uri("/addresses/getall").retrieve().body(new ParameterizedTypeReference<List<Address>>(){});

        return addresses;
    }
    @PostMapping("/addresses/saveall")
    public List<Address> saveAlladdress() {
        List<Address> addresses= restClient.get().uri("/addresses/saveall").retrieve().body(new ParameterizedTypeReference<List<Address>>(){});

        return addresses;
    }
    @PostMapping("/address/save")
    public Address saveaddress() {
        Address addresses= restClient.get().uri("/address/save").retrieve().body(new ParameterizedTypeReference<Address>(){});

        return addresses;
    }
    @GetMapping("/address/{id}")
    public Optional<Address> findByIdaddress() {
        Address addresses= restClient.get().uri("/address/{id}").retrieve().body(new ParameterizedTypeReference<Address>(){});

        return Optional.ofNullable(addresses);
    }
//    @DeleteMapping("/address/{id}/delete")
//    public void deleteByIdaddress(@PathVariable Long id) {
//        addressService.deleteById(id);
//    }
//    @DeleteMapping("/addresses/delete")
//    public void deleteaddress(@RequestBody Address entity) {
//        addressService.delete(entity);
//    }

}
// r