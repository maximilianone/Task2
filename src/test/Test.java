package test;


import static test.CreateLibrary.createLibrary;
import static test.Menu.menu;

public class Test {
    public static void main(String[] args) {
        Book[] libraryTest = createLibrary();
        menu(libraryTest);

    }
}
