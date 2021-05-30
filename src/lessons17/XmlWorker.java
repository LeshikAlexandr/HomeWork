package lessons17;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlWorker {

    private Book book;
    private String fileName;

    public XmlWorker(Book book, String fileName) {
        this.book = book;
        this.fileName = fileName;
    }

    public void writeObjectToXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(book, new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Book readObjectFromXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Book) unmarshaller.unmarshal(new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
