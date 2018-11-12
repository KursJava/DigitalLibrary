package pl.sidor;

import pl.sidor.model.Book;
import pl.sidor.service.BookDAOImpl;

import java.util.List;

public class Test {

    public static void main(String[] args) {

//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(WebConfig.class);

        BookDAOImpl bookDAO = new BookDAOImpl();
        List<Book> allBook = bookDAO.getAllBook();

        allBook.forEach(e -> System.out.println(e.getTitle()));

        Book book = bookDAO.findBook("Java Podstawy");

        System.out.println(book.getAuthor());

//        Kontekst

    }
}
