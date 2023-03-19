package com.mrsu.service.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @Column(name = "client_id")
    private int id;              // идентификатор

    @Column(name = "client_name")
    private String name;            // ФИО

    @Column(name = "personnel_number")
    private String personnelNumber; // персональный номер

    @Column(name = "address_id")
    private int  addressId;         // адрес проживания

}

