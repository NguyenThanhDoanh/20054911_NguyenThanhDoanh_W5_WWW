package fit.iuh.edu.vn.controller;

import fit.iuh.edu.vn.dataTo.AddressDto;
import fit.iuh.edu.vn.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AddressController {
    private AddressService addressService;
    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
    @GetMapping("/address")
    public String getAddress(Model model){
        List<AddressDto> addressDtos = addressService.getAllAddress();
        model.addAttribute("addresss",addressDtos);
        return "address-list";
    }
}
