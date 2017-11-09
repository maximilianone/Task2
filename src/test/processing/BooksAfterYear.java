<<<<<<< HEAD
package test.processing;

import test.Book;
import test.compare.YearComparator;

import java.util.Comparator;

public class BooksAfterYear {
    public static Book[] booksAfterYear(Book[] libraryTest, int year) {
        Book[] bookOfYear = new Book[libraryTest.length];
        int count = 0;
        Book exampleBook = new Book();
        exampleBook.setYear(year);
        Comparator cmp = new YearComparator();
        for (Book book:libraryTest) {
            if (cmp.compare(book, exampleBook) >= 0) {
                bookOfYear[count] = book;
                System.out.println(bookOfYear[count]);
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no books after this year in library");
            return new Book[0];
        }
        Book[] result = new Book[count];
        System.arraycopy(bookOfYear, 0, result, 0, result.length);
        return result;
    }
}
=======
package test.processing;

import test.Book;
import test.compare.CompareYear;

public class BooksAfterYear {
    public static Book[] booksAfterYear(Book[] libraryTest, int year) {
        Book[] bookOfYear = new Book[libraryTest.length];
        int count = 0;
        Book exampleBook = new Book();
        exampleBook.setYear(year);
        CompareYear cmp = new CompareYear();
        for (Book book:libraryTest) {
            if (cmp.compare(book, exampleBook) >= 0) {
                bookOfYear[count] = book;
                System.out.println(bookOfYear[count]);
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no books after this year in library");
            return new Book[0];
        }
        Book[] result = new Book[count];
        System.arraycopy(bookOfYear, 0, result, 0, result.length);
        return result;
    }
}
>>>>>>> 52a06713837ef0cc22bfc31bf533c6ee9bfde2d6
