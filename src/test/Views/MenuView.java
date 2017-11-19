package test.Views;

public class MenuView {
    public void menuText() {
        System.out.println("Enter 1 to find books of needed author");
        System.out.println("Enter 2 to find books of needed publisher");
        System.out.println("Enter 3 to find books published after specified year");
        System.out.println("Enter 4 to sort books by publisher");
        System.out.println("Enter 5 to show all books in library");
        System.out.println("Enter anything else to exit");
    }

    public void requestYear() {
        System.out.println("Enter year: ");
    }

    public void requestPublisher() {
        System.out.println("Enter publisher name: ");
    }

    public void requestAuthor() {
        System.out.println("Enter author name: ");
    }

    public void librarySorted() {
        System.out.println("Books sorted");
    }

    public void wrongInput() {
        System.out.println("Not a number or not integer number");
    }
    public void noAfterYear(){
        System.out.println("There are no books after this year in library");
    }
    public void noAuthor(){
        System.out.println("There are no books of this author in library");
    }
    public void noPublisher(){
        System.out.println("There are no books of this publisher in library");
    }
}
