package org.example.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //UserService userService = new UserService();

        //userService.registerUser();

        //System.out.println();


       Book book = new Book("bok1", "Jakob", BookStatus.Available, "991");
       Book book1 = new Book("bok2", "Vigor", BookStatus.Reserved, "101");
       Book book2 = new Book("bok3", "Adam", BookStatus.Unavailable, "2021");
       Book book3 = new Book("bok4", "Andreas", BookStatus.Available, "000");


        Library library = new Library();

        library.registerBook(book);
        library.registerBook(book1);
        library.registerBook(book2);
        library.registerBook(book3);



        //logga in och låna


        /*Book bookToBorrow = library.getBook("123");
        library.borrowBook(bookToBorrow);

        library.registerBook(bookToBorrow); */

        while(true) {
            System.out.println("Choose your action: \n" +
                    "1- Search for a book with ISBN number \n" +
                    "2- Get status of a book with ISBN number \n" +
                    "3- Get information of a book with ISBN number");
            Scanner scanner = new Scanner(System.in);
            int inputOption = scanner.nextInt();

            // 3. Skapa en simpel meny för att söka på böcker baserat på ISBN eller titel.
            switch (inputOption) {
                case 1:
                    System.out.println("Write ISBN number");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Search for a book through ISBN number: ");
                    String input = scanner1.nextLine();
                    //System.out.println(input); // prints the user input

                    library.getBook(input);
                    break;
                // get status of a book with ISBN number
                case 2:
                    System.out.println("Write ISBN number");
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Search for a book through ISBN number: ");
                    String input2 = scanner2.nextLine();

                    //bookstatus with ISBN number
                    System.out.println(library.getBookStatus(input2)); // see method in library
                    //library.getBookStatus(input2);
                    break;

                case 3:
                    System.out.println("Not implemented");
                    break;

            }
        }













        //book.status = BookStatus.values()[0];

    }
}