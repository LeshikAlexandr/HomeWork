package lessons17;

public class Main {

    public static void main(String[] args) {

        Book book = new Book(1234567, "Java Head First", 2020);
        book.setBook(new Book(90234, "Harry Potter", 2003));
        book.setBook(new Book(3845, "The Great Gatsby", 1925));
        String fileName = "booksxml.xml";
        String newFileName = "booksjson.json";

//        XmlWorker xmlWorker = new XmlWorker(book, fileName);
//        xmlWorker.writeObjectToXml();
//
//        System.out.println(xmlWorker.readObjectFromXml());

//        Animal animal = new Animal(1, "Cat");

        JacksonWorker jacksonWorker = new JacksonWorker(book, newFileName);
        jacksonWorker.writeObjectToJSON();
//
//        System.out.println(jacksonWorker.readObjectFromJSON());

//        Book book1 = new Book(1234567, "Java Head First", 2020);
//        Book book2 = new Book(90234, "Harry Potter", 2003);
//        Book book3 = new Book(3845, "The Great Gatsby", 1925);
//
//        BooksList booksList = new BooksList();
//        booksList.addBook(book1);
//        booksList.addBook(book2);
//        booksList.addBook(book3);
//
//        XMLWorkerTest xmlWorkerTest = new XMLWorkerTest(booksList, "Test.xml");
//        xmlWorkerTest.writeObjectToXml();
//
//        System.out.println(xmlWorkerTest.readObjectFromXml());
    }
}
