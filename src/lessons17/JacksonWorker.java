package lessons17;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class JacksonWorker {

    private Book book;
    private Animal animal;
    private String fileName;

    public JacksonWorker(Book book, String fileName) {
        this.book = book;
        this.fileName = fileName;
    }

    public JacksonWorker(Animal animal, String fileName) {
        this.animal = animal;
        this.fileName = fileName;
    }

    public void writeObjectToJSON() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(fileName), book);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Book readObjectFromJSON() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(fileName), Book.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
