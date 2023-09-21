package org.example.Library;


import java.util.ArrayList;
import java.util.List;

// 2. Skapa en library klass som har en lista av böcker samt innehåller metoder för att
//låna, lämna tillbaka och hämta status & information om en viss bok.
public class Library {

    List<Book> books = new ArrayList<>(); //needs to be outside the constructor, so that other methods can use it


    public void registerBook(Book bookToRegister){
        books.add(bookToRegister);
        //System.out.println(books);
    }

    // gets book by ISBN
    public Book getBook(String ISBN){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                System.out.println("We found this book with your ISBN number:"+ books.get(i));
                return books.get(i);
            }
        }
        return null;
    }


    public BookStatus getBookStatus(String ISBN){
        Book book = getBook(ISBN); // uses method above, to get the book instance
        return book.getStatus();
    }


    public void returnBook (Book book) {
        //kod
    }
    // user as parameter
    public void borrowBook (Book book) {
        //book.setStatus();
        //book.setBorrower(); skapa borrower parameter på Book klassen
        //kod
    }
}
