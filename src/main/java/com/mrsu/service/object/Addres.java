package com.mrsu.service.object;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Addres {

    @Id
    @Column(name = "address_id")
    private int id;           // идентификатор

    @Column(name = "city")
    private String city;         // город

    @Column(name = "street")
    private String street;       // улица

    @Column(name = "house")
    private int house;        // дом

    @Column(name = "floor")
    private int floor;        // этаж

    @Column(name = "flatNumber")
    private int flatNumber;   // квартира

    }