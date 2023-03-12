package com.mrsu.service.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    public int id;              // идентификатор
    public String name;            // ФИО
    public String personnelNumber; // персональный номер
    public Addres address;         // адрес проживания

    public String toString() {
        String string = id + " " + name + " " + personnelNumber + " " + address.getCity() + " " + address.getStreet() + " " + address.getHouse() + " " + address.getFloor() + " " + address.getFlatNumber();

        return string;
    }

    public String toStringName() {
        String string = id + " " + name + " " + personnelNumber;
        return string;
    }

    public String toStringAddres() {
        return address.getCity() + " " + address.getStreet() + " " + address.getHouse() + " " + address.getFloor() + " " + address.getFlatNumber();

    }
}

