package lessons17;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLWorkerTest {

    private final BooksList books;
    private final String fileName;

    public XMLWorkerTest(BooksList books, String fileName) {
        this.books = books;
        this.fileName = fileName;
    }

    public void writeObjectToXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(BooksList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(books, new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public BooksList readObjectFromXml() {
        try {
            JAXBContext context = JAXBContext.newInstance(BooksList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (BooksList) unmarshaller.unmarshal(new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
