package test.processing;
import test.Book;

import java.util.Comparator;


public class AuthorsBooks {
    public static Book[] authorsBooks(Book[] libraryTest, String author) {
        Book[] authorsbook = new Book[libraryTest.length];
        int count = 0;
        for (Book book:libraryTest) {
            if (author.equals(book.getAuthor())) {
                authorsbook[count] = book;
                count++;
            }
        }
        if (count==0){
            return null;
        }
        Book[] result = new Book[count];
        System.arraycopy(authorsbook, 0, result, 0, result.length);
        return result;
    }
}
