package com.mrsu.controller;


import com.mrsu.service.AddressService;
import com.mrsu.service.ClientService;
import com.mrsu.service.object.Addres;
import com.mrsu.service.object.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    private final AddressService addressService;
    public AddressController (AddressService addressService) {
        this.addressService=addressService;
    }
    @GetMapping("internal/address")
    public List<Addres> getAddresses (){
        return addressService.getAddresses();
    }

}