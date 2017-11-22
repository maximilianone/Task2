package task3.controller;

import task3.model.Book;
import task3.input.MyScanner;
import task3.service.filters.AuthorFilter;
import task3.service.filters.PublisherFilter;
import task3.service.filters.YearFilter;
import task3.views.MenuView;
import task3.service.comparators.BookPublisherComparator;

import java.util.Arrays;

public class Menu {
    private Book[] library;
    private MenuView menuView;
    private MyScanner scanner;
    private BookPublisherComparator comparator;
    private boolean menu;

    public Menu(Book[] library, MenuView menuView, MyScanner scanner) {
        this.library = library;
        this.menuView = menuView;
        this.scanner = scanner;
        this.comparator = new BookPublisherComparator();
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
        menuView.displayMessage(menuView.REQUEST_AUTHOR);

        Book[] result = new AuthorFilter(scanner.readInput()).filter(library);
        menuView.display(menuView.NO_AUTHOR, result);
    }

    private void searchByPublisher() {
        menuView.displayMessage(menuView.REQUEST_PUBLISHER);
        Book[] result = new PublisherFilter(scanner.readInput()).filter(library);
        menuView.display(menuView.NO_PUBLISHER, result);
    }

    private void searchByYear() {
        menuView.displayMessage(menuView.REQUEST_YEAR);
        try {
            int year = Integer.parseInt(scanner.readInput());
            Book[] result = new YearFilter(year).filter(library);
            menuView.display(menuView.NO_AFTER_YEAR, result);
        } catch (NumberFormatException e) {
            menuView.displayMessage(menuView.WRONG_INPUT);
        }
    }

    private void sortByPublisher() {
        Arrays.sort(library, comparator);
        menuView.displayMessage(menuView.LIBRARY_SORTED);
    }

    private void showAll() {
        menuView.display(menuView.NO_LIBRARY, library);
    }

    private void exit() {
        menu = false;
    }
}




