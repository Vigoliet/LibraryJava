package org.example.Library;


// 1. Skapa en book klass som innehåller title, author, status & ISBN (string). Skapa nödvändiga
//metoder.
public class Book {

    private String title;
    private String author;
    private BookStatus status;
    private String ISBN;




    public Book(String title, String author, BookStatus status, String ISBN) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.ISBN = ISBN;

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

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}

//alternatives
enum BookStatus{
    Available,
    Unavailable,
    Reserved
}
