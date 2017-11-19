package test.Views;

import test.Book;

public class LibraryView {
    public void showLibrary(Book[] library){
        for (Book book : library) {
            new BookView().showBook(book);
        }
    }
}
