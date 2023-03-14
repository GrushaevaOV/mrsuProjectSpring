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

}

