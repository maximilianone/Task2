package test.processing;

import test.Book;
import test.compare.BookPublisherComparator;

import java.util.Comparator;

public class PublishersBooks {
    public static Book[] publishersBooks(Book[] libraryTest, String publisher) {
        Book[] publishersBook = new Book[libraryTest.length];
        int count = 0;
        for (Book book : libraryTest) {
            if (publisher.equals(book.getPublisher())) {
                publishersBook[count] = book;
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Book[] result = new Book[count];
        System.arraycopy(publishersBook, 0, result, 0, result.length);
        return result;
    }
}
