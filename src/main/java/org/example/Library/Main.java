package org.example.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        // Login

        UserService userService = new UserService();

        userService.registerUser("Vigor", "123");

        userService.loginUser("Vigor", "123");



        while (true) {
            //login feature
            Scanner scannerTest = new Scanner(System.in);
            System.out.println("Username: ");
            String username = scannerTest.next();
            System.out.println("Password: ");
            System.out.println();
            String password = scannerTest.next();

            if (userService.loginUser(username, password)){
                System.out.println("Login success");
                break;
            } else {
                System.out.println("Login failed");
            }
        }


        // Books

        Book book = new Book("bok1", "Jakob", BookStatus.Available, "991");
        Book book1 = new Book("bok2", "Vigor", BookStatus.Reserved, "101");
        Book book2 = new Book("bok3", "Adam", BookStatus.Unavailable, "2021");
        Book book3 = new Book("bok4", "Andreas", BookStatus.Available, "000");

        // Register books in library

        Library library = new Library();

        library.registerBook(book);
        library.registerBook(book1);
        library.registerBook(book2);
        library.registerBook(book3);

        /*
        Book bookToBorrow = library.getBook("101");
        library.borrowBook(bookToBorrow, userService.loggedInUser); // bookToBorrow variable and the current logged in user
        */


        while (true) {
            System.out.println("Choose your action: \n" +
                    "1- Search  \n" +
                    "2- Get status \n" +
                    "3- Borrow book \n" +
                    "4- Return book \n");
            Scanner scanner = new Scanner(System.in);
            int inputOption = scanner.nextInt();

            System.out.println("ISBN: ");
            String isbnInput = scanner.next();
            Book b = library.getBook(isbnInput); // will be used in all options

            // 3. Skapa en simpel meny för att söka på böcker baserat på ISBN eller titel.
            switch (inputOption) {
                case 1:
                    System.out.println(b);
                    break;

                // get status of a book with ISBN number
                case 2:
                    BookStatus c = library.getBookStatus(isbnInput);
                    System.out.println(c);
                    break;

                // borrow book
                case 3:
                    library.borrowBook(b, userService.loggedInUser);
                    break;

                // return book
                case 4:
                    library.returnBook(b);
                    break;

            }
        }


        //book.status = BookStatus.values()[0];



    }
}