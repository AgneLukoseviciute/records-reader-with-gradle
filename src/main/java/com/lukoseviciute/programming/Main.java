package com.lukoseviciute.programming;

import com.lukoseviciute.programming.util.CompareAll;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) {

        //CompareAll comparator = new CompareAll("assets/records.csv", "assets/records_tweaked.json", "assets/records_tweaked.xml");
        //TODO: add 'comparator.getXmlAthleteList()' param once method is expanded
        // comparator.printDifferences(comparator.getCsvAthleteList(), comparator.getJsonAthleteList());

        String xml = "<Response><data>123414234</data></Response>";

        JAXBContext jaxbContext = null;
        Response respOut = null;
        try {
            jaxbContext = JAXBContext.newInstance(Response.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader xmlReader = new StringReader(xml);
            respOut = (Response) unmarshaller.unmarshal(xmlReader);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + respOut.data );
    }

    @XmlRootElement(name = "Response")
    static class Response{

        @XmlElement
        String data;
    }
}

