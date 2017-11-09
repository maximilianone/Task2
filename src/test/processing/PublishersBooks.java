package test.processing;

import test.Book;
import test.compare.CompareBookPublisher;

public class PublishersBooks {
    public static Book[] publishersBooks(Book[] libraryTest, String publisher) {
        Book[] publishersBook = new Book[libraryTest.length];
        int count = 0;
        Book exampleBook = new Book();
        exampleBook.setPublisher(publisher);
        CompareBookPublisher cmp = new CompareBookPublisher();
        for (Book book : libraryTest) {
            if (cmp.compare(book, exampleBook) == 0) {
                publishersBook[count] = book;
                System.out.println(publishersBook[count]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no books of this publisher in library");
            return new Book[0];
        }
        Book[] result = new Book[count];
        System.arraycopy(publishersBook, 0, result, 0, result.length);
        return result;
    }
}
