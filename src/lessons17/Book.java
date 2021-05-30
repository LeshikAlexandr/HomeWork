package lessons17;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
@JsonPropertyOrder (value = {"name", "year", "vendorCode", "sameBooks"})
@XmlRootElement(name = "BOOK")
@XmlType(propOrder = {"name", "year", "vendorCode", "sameBooks"})
public class Book {

    private int vendorCode;
    private String name;
    private int year;
    private List<Book> sameBooks = new ArrayList<>();

    public Book() {
    }

    public Book(int vendorCode, String name, int year) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.year = year;
    }

    @JsonProperty("VendorCode")
    @XmlElement(name = "Vendor_Code")
    public int getVendorCode() {
        return vendorCode;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public int getYear() {
        return year;
    }

    @XmlElementWrapper (name = "Same_Books")
    public List<Book> getSameBooks() {
        return sameBooks;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBook(Book book) {
        sameBooks.add(book);
    }

    @Override
    public String toString() {
        return "The book - " + name + ", year - " + year + " vendor code - " + vendorCode
                + (sameBooks.size() > 0 ? "\nSame books: " + sameBooks : "");
    }
}
