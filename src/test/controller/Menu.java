package test.controller;


import test.Book;
import test.MyScanner;
import test.processors.AuthorFilter;
import test.processors.PublisherFilter;
import test.processors.YearFilter;
import test.views.MenuView;
import test.comparators.BookPublisherComparator;

import java.util.Arrays;

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
            processInput(scanner.readInput());
        }
    }

    private void processInput(String statement) {
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

        Book[] result = new AuthorFilter(scanner.readInput()).filter(library);
        menuView.display(menuView.NO_AUTHOR, result);
    }

    private void searchByPublisher() {
        menuView.requestPublisher();
        Book[] result = new PublisherFilter(scanner.readInput()).filter(library);
        menuView.display(menuView.NO_PUBLISHER, result);
    }

    private void searchByYear() {
        menuView.requestYear();
        try {
            int year = Integer.parseInt(scanner.readInput());
            Book[] result = new YearFilter(year).filter(library);
            menuView.display(menuView.NO_AFTER_YEAR, result);
        } catch (NumberFormatException e) {
            menuView.wrongInput();
        }
    }

    private void sortByPublisher() {
        Arrays.sort(library, new BookPublisherComparator());
        menuView.librarySorted();
    }

    private void showAll() {
        menuView.display(menuView.NO_LIBRARY, library);
    }

    private void exit() {
        menu = false;
    }
}




