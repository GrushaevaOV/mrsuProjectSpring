package com.mrsu.jpa;

import com.mrsu.service.object.Addres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository <Addres, Integer> {
}
