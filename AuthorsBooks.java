public class AuthorsBooks {
    public static Book[] authorsBooks(Book[] libraryTest, String author) {
        Book[] authorsbook = new Book[libraryTest.length];
        int count = 0;
        Book exampleBook = new Book();
        exampleBook.setAuthor(author);
        CompareAuthor cmp = new CompareAuthor();
        for (Book book:libraryTest) {
            if (cmp.compare(book, exampleBook) == 0) {
                authorsbook[count] = book;
                System.out.println(authorsbook[count]);
                count++;
            }
        }
        Book[] result = new Book[count];
        System.arraycopy(authorsbook, 0, result, 0, result.length);
        return result;
    }
}
