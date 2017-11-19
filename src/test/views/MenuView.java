package test.views;

import test.Book;

public class MenuView {
    public final String NO_PUBLISHER = "There are no books of this publisher in library";
    public final String NO_AUTHOR = "There are no books of this author in library";
    public final String NO_AFTER_YEAR = "There are no books after this year in library";
    public final String NO_LIBRARY = "There is no library to display";

    public void menuText() {
        System.out.println("Enter 1 to find books of needed author");
        System.out.println("Enter 2 to find books of needed publisher");
        System.out.println("Enter 3 to find books published after specified year");
        System.out.println("Enter 4 to sort books by publisher");
        System.out.println("Enter 5 to show all books in library");
        System.out.println("Enter anything else to exit");
    }

    public void requestYear() {
        System.out.println("Enter year: ");
    }

    public void requestPublisher() {
        System.out.println("Enter publisher name: ");
    }

    public void requestAuthor() {
        System.out.println("Enter author name: ");
    }

    public void librarySorted() {
        System.out.println("Books sorted");
    }

    public void wrongInput() {
        System.out.println("Not a number or not integer number");
    }

    private void noResult(String str) {
        System.out.println(str);
    }

    public void display(String nullResult, Book[] result){
        if (result == null) {
            noResult(nullResult);
        } else {
            new LibraryView().showLibrary(result);
        }
    }
}

