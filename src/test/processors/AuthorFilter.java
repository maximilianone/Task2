package test.processors;

import test.Book;


public class AuthorFilter extends Filter {
    private final String author;

    public AuthorFilter(String author) {
        this.author = author;
    }

    @Override
    public boolean checkCondition(Book book) {
        return (author.equals(book.getAuthor()));
    }

}
