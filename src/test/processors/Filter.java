package test.processors;


import test.Book;

abstract class Filter {
    public Book[] filter(Book[] library) {
        Book[] authorsbook = new Book[library.length];
        int count = 0;
        for (Book book : library) {
            if (checkCondition(book)) {
                authorsbook[count] = book;
                count++;
            }
        }
        Book[] result = new Book[count];
        System.arraycopy(authorsbook, 0, result, 0, result.length);
        return result;
    }

    abstract boolean checkCondition(Book book);
}
