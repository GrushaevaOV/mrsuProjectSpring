package com.mrsu.service;

import com.mrsu.service.object.Addres;

import java.util.List;

public interface AddressService {

    List<Addres> getAddresses();
    void setAddress(List <Addres> addressBook);

}
