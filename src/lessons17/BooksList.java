package lessons17;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "BookList")
@XmlType(propOrder = {"books"})
public class BooksList {

    private List<Book> books = new ArrayList<>();

    @XmlElementWrapper(name = "List_Of_Books")
    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "BooksList{" +
                "books=" + books +
                '}';
    }
}
