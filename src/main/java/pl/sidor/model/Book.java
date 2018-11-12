package pl.sidor.model;

import java.io.Serializable;

public class Book implements Serializable {


    private int id;
    private String title;
    private String author;
    private int pages;
    private String ISBN;

    public Book() {
    }

    public Book(int id, String title, String author, int pages, String ISBN) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", author='" + author + '\'' + ", pages=" + pages + ", ISBN='" + ISBN + '\'' + '}';
    }
}
