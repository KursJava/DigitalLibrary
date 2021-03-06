package pl.sidor.service;

import pl.sidor.dao.BookDAO;
import pl.sidor.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookDAOImpl implements BookDAO {

    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> getAllBook() {
        Book book = new Book(1, "Java Podstawy", "Alan", 509, "ISB23");
        Book book2 = new Book(2, "Java 10", "Carl", 609, "ISB23");
        Book book3 = new Book(3, "Hibernate w akcji", "Alan", 500, "ISB23");
        Book book4 = new Book(4, "JUnit w akcji", "Mike", 250, "ISB23");
        Book book5 = new Book(5, "Spring w akcji", "John", 809, "ISB23");

        bookList.add(book);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void deleteBook(int id) {

        bookList.remove(id);
    }

    public Book findBook(String title) {

        List<Book> collect = bookList.stream().filter(b -> b.getTitle().equals(title)).collect(Collectors.toList());

        Book books = new Book();

        for (Book book : collect) {

            books.setId(book.getId());
            books.setTitle(book.getTitle());
            books.setAuthor(book.getAuthor());
            books.setISBN(book.getISBN());
            books.setPages(book.getPages());
        }
        return books;
    }
}
