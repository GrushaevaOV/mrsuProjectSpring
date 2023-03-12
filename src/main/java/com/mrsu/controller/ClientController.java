package com.mrsu.controller;


import com.mrsu.service.AddressService;
import com.mrsu.service.ClientService;
import com.mrsu.service.object.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientService;
    public ClientController (ClientService clientService) {
        this.clientService=clientService;
    }
    @GetMapping("internal/clients")
    public List<Client> getClient (){
        return clientService.getClients();
    }
    /*private final AddressService addressService;
    public AddressController (AddressService addressService) {
        this.addressService=addressService;
    }
    @GetMapping("internal/address")
    public List<Client> getAddresses (){
        return addressService.getAddresses();
    }*/

}
