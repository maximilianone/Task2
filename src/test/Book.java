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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
