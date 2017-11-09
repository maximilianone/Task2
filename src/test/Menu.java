<<<<<<< HEAD
package test;


import test.compare.BookPublisherComparator;
import test.processing.AuthorsBooks;
import test.processing.BooksAfterYear;
import test.processing.PublishersBooks;

import java.util.Arrays;
import java.util.Scanner;

class Menu {
    static void menu(Book[] libraryTest) {
        Scanner in = new Scanner(System.in);
        String statement = menuText(in);
        boolean menu = true;
        while (menu) {
            switch (statement) {
                case "1":
                    System.out.println("Enter author name: ");
                    AuthorsBooks.authorsBooks(libraryTest, in.next());
                    statement = menuText(in);
                    break;
                case "2":
                    System.out.println("Enter publisher name: ");
                    PublishersBooks.publishersBooks(libraryTest, in.next());
                    statement = menuText(in);
                    break;
                case "3":
                    System.out.println("Enter year: ");
                    int value;
                    try {
                        value = in.nextInt();
                    } catch (java.util.InputMismatchException o) {
                        System.out.println("Not a number or not integer number");
                        break;
                    }
                    BooksAfterYear.booksAfterYear(libraryTest, value);
                    statement = menuText(in);
                    break;
                case "4":
                    Arrays.sort(libraryTest, new BookPublisherComparator());
                    System.out.println("Books sorted");
                    statement = menuText(in);
                    break;
                case "5":
                    for (Book book :
                            libraryTest) {
                        System.out.println(book);
                    }
                    statement = menuText(in);
                    break;
                default:
                    menu = false;
            }
        }
        in.close();
    }

    private static String menuText(Scanner in) {
        System.out.println("Enter 1 to find books of needed author");
        System.out.println("Enter 2 to find books of needed publisher");
        System.out.println("Enter 3 to find books published after specified year");
        System.out.println("Enter 4 to sort books by publisher");
        System.out.println("Enter 5 to show all books in library");
        System.out.println("Enter anything else to exit");
        return in.next();
    }

}
=======
package test;


import test.compare.CompareBookPublisher;
import test.processing.AuthorsBooks;
import test.processing.BooksAfterYear;
import test.processing.PublishersBooks;

import java.util.Arrays;
import java.util.Scanner;

class Menu {
    static void menu(Book[] libraryTest) {
        Scanner in = new Scanner(System.in);
        String statement = menuText(in);
        outer:
        while (true) {
            switch (statement) {
                case "1":
                    System.out.println("Enter author name: ");
                    AuthorsBooks.authorsBooks(libraryTest, in.next());
                    statement = menuText(in);
                    break;
                case "2":
                    System.out.println("Enter publisher name: ");
                    PublishersBooks.publishersBooks(libraryTest, in.next());
                    statement = menuText(in);
                    break;
                case "3":
                    System.out.println("Enter year: ");
                    int value;
                    try {
                        value = in.nextInt();
                    } catch (java.util.InputMismatchException o) {
                        System.out.println("Not a number or not integer number");
                        break;
                    }
                    BooksAfterYear.booksAfterYear(libraryTest, value);
                    statement = menuText(in);
                    break;
                case "4":
                    Arrays.sort(libraryTest, new CompareBookPublisher());
                    System.out.println("Books sorted");
                    statement = menuText(in);
                    break;
                case "5":
                    for (Book book :
                            libraryTest) {
                        System.out.println(book);
                    }
                    statement = menuText(in);
                    break;
                default:
                    break outer;
            }
        }
        in.close();
    }

    private static String menuText(Scanner in) {
        System.out.println("Enter 1 to find books of needed author");
        System.out.println("Enter 2 to find books of needed publisher");
        System.out.println("Enter 3 to find books published after specified year");
        System.out.println("Enter 4 to sort books by publisher");
        System.out.println("Enter 5 to show all books in library");
        System.out.println("Enter anything else to exit");
        return in.next();
    }

}
>>>>>>> 52a06713837ef0cc22bfc31bf533c6ee9bfde2d6
