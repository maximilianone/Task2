package test;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pageNumber;
    private double price;

    public Book(String name, String author, String publisher, int year, int pageNumber, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public Book() {

    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        String result = "Book name: " + this.name + '\n';
        result += "Author: " + this.author + '\n';
        result += "Publisher: " + this.publisher + '\n';
        result += "Year: " + this.year + '\n';
        result += "Page number: " + this.pageNumber + '\n';
        result += "Price: " + this.price + '\n';
        return result;
    }
}
