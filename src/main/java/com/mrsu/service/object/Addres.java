package com.mrsu.service.object;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Addres {
    public int id;           // идентификатор
    public String city;         // город
    public String street;       // улица
    public int house;        // дом
    public int floor;        // этаж
    public int flatNumber;   // квартира

    public String toStringAddress() {
        return id + " " + city + " " + street + " " + house + " " + floor + " " + flatNumber;
    }
}