package test.views;

import test.Book;

public class BookView {
    public void showBook(Book book) {
        System.out.println("Book name: " + book.getName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Year: " + book.getYear());
        System.out.println("Page number: " + book.getPageNumber());
        System.out.println("Price: " + book.getPrice());
        System.out.println();
    }
}