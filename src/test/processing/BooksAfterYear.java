package test.processing;

import test.Book;

import java.util.Comparator;

public class BooksAfterYear {
    public static Book[] booksAfterYear(Book[] libraryTest, int year) {
        Book[] bookOfYear = new Book[libraryTest.length];
        int count = 0;
        for (Book book:libraryTest) {
            if (year<=book.getYear()) {
                bookOfYear[count] = book;
                count++;
            }
        }
        if (count==0){
            return null;
        }
        Book[] result = new Book[count];
        System.arraycopy(bookOfYear, 0, result, 0, result.length);
        return result;
    }
}
