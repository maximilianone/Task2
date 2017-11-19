package test;


import test.Views.MenuView;
import test.controller.Menu;

import static test.LibraryCreation.createLibrary;

public class Test {
    public static void main(String[] args) {
        Book[] libraryTest = createLibrary();
        MyScanner scanner = new MyScanner();
        MenuView menuView = new MenuView();
        Menu menu = new Menu(libraryTest, menuView, scanner);
        menu.run();
    }
}
