package test;

import java.util.Scanner;

public class MyScanner {
    private Scanner scanner;

    public MyScanner(){
        scanner = new Scanner(System.in);
    }

    public Scanner getScaner() {
        return scanner;
    }

    public void closeScanner(){
        this.scanner.close();
    }

    public String readInput() {
        return this.scanner.next();
    }
}
