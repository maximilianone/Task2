package test.processors;

import test.Book;

public class YearFilter extends Filter {
    private final int year;

    public YearFilter(int year) {
        this.year = year;
    }

    @Override
    public boolean checkCondition(Book book) {
        return (year<=book.getYear());
    }
}
