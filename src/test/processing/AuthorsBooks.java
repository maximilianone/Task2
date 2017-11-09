package test.processing;
import test.Book;
import test.compare.AuthorComparator;

import java.util.Comparator;


public class AuthorsBooks {
    public static Book[] authorsBooks(Book[] libraryTest, String author) {
        Book[] authorsbook = new Book[libraryTest.length];
        int count = 0;
        Book exampleBook = new Book();
        exampleBook.setAuthor(author);
        Comparator cmp = new AuthorComparator();
        for (Book book:libraryTest) {
            if (cmp.compare(book, exampleBook) == 0) {
                authorsbook[count] = book;
                System.out.println(authorsbook[count]);
                count++;
            }
        }
        if (count==0){
            System.out.println("There are no books of this author in library");
            return new Book[0];
        }
        Book[] result = new Book[count];
        System.arraycopy(authorsbook, 0, result, 0, result.length);
        return result;
    }
}
