package com.mrsu.jpa;

import com.mrsu.service.object.Addres;
import com.mrsu.service.object.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {


}
