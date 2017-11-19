package test.processors;

import test.Book;

public class PublisherFilter extends Filter {
    private final String publisher;

    public PublisherFilter(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean checkCondition(Book book) {
        return (publisher.equals(book.getPublisher()));
    }
}
