package test.controller;


import test.Book;
import test.MyScanner;
import test.Views.LibraryView;
import test.Views.MenuView;
import test.compare.BookPublisherComparator;

import java.util.Arrays;

import static test.processing.AuthorsBooks.authorsBooks;
import static test.processing.BooksAfterYear.booksAfterYear;
import static test.processing.PublishersBooks.publishersBooks;

public class Menu {
    private Book[] library;
    private MenuView menuView;
    private MyScanner scanner;
    private boolean menu;

    public Menu(Book[] library, MenuView menuView, MyScanner scanner) {
        this.library = library;
        this.menuView = menuView;
        this.scanner = scanner;
    }

    public void run() {
        menu = true;
        while (menu) {
            menuView.menuText();
            mainMenu(scanner.readInput());
        }
    }

    private void mainMenu(String statement) {
        switch (statement) {
            case "1":
                searchByAuthor();
                break;
            case "2":
                searchByPublisher();
                break;
            case "3":
                searchByYear();
                break;
            case "4":
                sortByPublisher();
                break;
            case "5":
                showAll();
                break;
            default:
                exit();
                break;
        }
    }

    private void searchByAuthor() {
        menuView.requestAuthor();
        Book[] result = authorsBooks(library, scanner.readInput());
        if (result == null) {
            menuView.noAuthor();
        } else {
            new LibraryView().showLibrary(result);
        }
    }

    private void searchByPublisher() {
        menuView.requestPublisher();
        Book[] result = publishersBooks(library, scanner.readInput());
        if (result == null) {
            menuView.noPublisher();
        } else {
            new LibraryView().showLibrary(result);
        }
    }

    private void searchByYear() {
        menuView.requestYear();
        try {
            int year = Integer.parseInt(scanner.readInput());
            Book[] result = booksAfterYear(library, year);
            if (result == null) {
                menuView.noAfterYear();
            } else {
                new LibraryView().showLibrary(result);
            }
        } catch (NumberFormatException e) {
            menuView.wrongInput();
        }
    }

    private void sortByPublisher() {
        Arrays.sort(library, new BookPublisherComparator());
        menuView.librarySorted();
    }

    private void showAll() {
        new LibraryView().showLibrary(library);
    }

    private void exit() {
        menu = false;
    }
}




