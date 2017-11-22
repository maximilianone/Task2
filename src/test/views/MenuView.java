package task3.views;

import task3.model.Book;

public class MenuView {
    public final String NO_PUBLISHER = "There are no books of this publisher in library";
    public final String NO_AUTHOR = "There are no books of this author in library";
    public final String NO_AFTER_YEAR = "There are no books after this year in library";
    public final String NO_LIBRARY = "There is no library to display";
    public final String REQUEST_AUTHOR = "Enter author";
    public final String REQUEST_PUBLISHER = "Enter publisher";
    public final String REQUEST_YEAR = "Enter year";
    public final String LIBRARY_SORTED = "Books sorted";
    public final String WRONG_INPUT = "Not a number or not integer number";

    public void menuText() {
        System.out.println("Enter 1 to find books of needed author");
        System.out.println("Enter 2 to find books of needed publisher");
        System.out.println("Enter 3 to find books published after specified year");
        System.out.println("Enter 4 to sort books by publisher");
        System.out.println("Enter 5 to show all books in library");
        System.out.println("Enter anything else to exit");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void display(String nullResult, Book[] result) {
        if (result.length == 0) {
            displayMessage(nullResult);
        } else {
            new LibraryView().showLibrary(result);
        }
    }
}

