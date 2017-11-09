package test.compare;

import test.Book;

import java.util.Comparator;

public class CompareYear implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Book book1 = (Book) o1;
        Book book2 = (Book) o2;
        if (book1.getYear() > book2.getYear()) {
            return 1;
        } else if (book1.getYear() < book2.getYear()) {
            return -1;
        }
        return 0;
    }
}
