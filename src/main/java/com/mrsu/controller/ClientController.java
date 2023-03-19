package com.mrsu.controller;


import com.mrsu.jpa.ClientRepository;
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

    @GetMapping
    public void setClients (ClientRepository clientRepository) {

        clientService.setClients(clientRepository);

    }

}
