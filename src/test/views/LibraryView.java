package test.views;

import test.Book;

public class LibraryView {
    private BookView bookView;

    public LibraryView() {
        this.bookView = new BookView();
    }

    public void showLibrary(Book[] library) {
        for (Book book : library) {
            bookView.showBook(book);
        }
    }
}
