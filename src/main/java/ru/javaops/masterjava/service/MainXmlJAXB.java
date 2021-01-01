package ru.javaops.masterjava.service;

import ru.javaops.masterjava.xml.util.JaxbMarshaller;
import ru.javaops.masterjava.xml.util.JaxbUnmarshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

public class MainXmlJAXB {
    protected JaxbUnmarshaller jaxbUnmarshaller;
    protected Schema schema;

    public MainXmlJAXB(Class... classesToBeBound) {
        try {
            init(JAXBContext.newInstance(classesToBeBound));
        } catch (JAXBException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private void init(JAXBContext ctx) throws JAXBException {
        jaxbUnmarshaller = new JaxbUnmarshaller(ctx);
    }
}
