package com.lukoseviciute.programming.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.lukoseviciute.programming.models.Athlete;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.lukoseviciute.programming.models.XMLRoot;

public class XMLFileReader implements FileReaderI {

    ArrayList<Athlete> xmlAthleteList = new ArrayList<Athlete>();

    public XMLFileReader(){

    }

    @Override
    public List<Athlete> intoObjects(String xmlStr){
        File xmlFile = new File(xmlStr);

        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(XMLRoot.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            XMLRoot root = (XMLRoot) unmarshaller.unmarshal(xmlFile);
            xmlAthleteList = root.getArray();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlAthleteList;
    }

}

/* String xml = "<Response><data>123414234</data></Response>";

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

*/



/* @XmlRootElement(name = "Response")
    static class Response{

        @XmlElement
        String data;
    }
*/