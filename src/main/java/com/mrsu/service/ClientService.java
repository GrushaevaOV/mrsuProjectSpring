package com.mrsu.service;

import com.mrsu.jpa.ClientRepository;
import com.mrsu.service.object.Client;

import java.util.List;

public interface ClientService {

    List<Client>  getClients();
    void setClients(List <Client> clients);

}
