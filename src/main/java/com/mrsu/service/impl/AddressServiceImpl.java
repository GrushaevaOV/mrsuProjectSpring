package com.mrsu.service.impl;

import com.mrsu.service.AddressService;
import com.mrsu.service.object.Addres;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {
    private final ResourceLoader resourcLoader;
    public AddressServiceImpl(ResourceLoader resourcLoader) {
        this.resourcLoader = resourcLoader;
    }
    @Override
    public List <Addres> getAddresses() {

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = null;
        try {
            Resource resource = resourcLoader.getResource("classpath:address.xml");
            InputStream inputStream = resource.getInputStream();
            parser = factory.createXMLStreamReader(inputStream);
        } catch (FileNotFoundException e) {
            System.out.println("Check file path");
        } catch (XMLStreamException | IOException e) {
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
                        Addres adddress = new Addres();
                        adddress.setId(Integer.parseInt(parser.getAttributeValue(0)));
                        adddress.setCity(parser.getAttributeValue(1));
                        adddress.setStreet(parser.getAttributeValue(2));
                        adddress.setHouse(Integer.parseInt(parser.getAttributeValue(3)));
                        adddress.setFloor(Integer.parseInt(parser.getAttributeValue(4)));
                        adddress.setFlatNumber(Integer.parseInt(parser.getAttributeValue(5)));
                        addressBook.add(adddress);
                    }
                }
            }

        } catch (XMLStreamException e) {
            System.out.println(e.getMessage());
        }

    return addressBook;
    }

}
