package com.mrsu.service.impl;

import com.mrsu.service.AddressService;
import com.mrsu.service.object.Addres;
import org.springframework.stereotype.Service;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    public static List<Addres> listAdress = new ArrayList<>();
    @Override
    public List <Addres> getAddresses() {

      XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = null;

        try {
            parser = factory.createXMLStreamReader(new FileInputStream(("classpath:address.xml")));
        } catch (FileNotFoundException e) {
            System.out.println("Check file path");
        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }
        List<Addres> addressBook = new ArrayList<>();
        try {
            while (true) {
                assert parser != null;
                if (!parser.hasNext()) break;
                int event = parser.next();
                if (event == XMLStreamConstants.START_ELEMENT) {
                    if (parser.getLocalName().equals("address")) {
                        Addres add = new Addres();
                        add.setId(Integer.parseInt(parser.getAttributeValue(0)));
                        add.setCity(parser.getAttributeValue(1));
                        add.setStreet(parser.getAttributeValue(2));
                        add.setHouse(Integer.parseInt(parser.getAttributeValue(3)));
                        add.setFloor(Integer.parseInt(parser.getAttributeValue(4)));
                        add.setFlatNumber(Integer.parseInt(parser.getAttributeValue(5)));
                        addressBook.add(add);
                    }
                }
            }

        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }
        listAdress = addressBook;
    return addressBook;
    }

}
