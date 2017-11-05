package com.company.task11.classes_task1;

public class MaiPrintableBookMagazin {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];

        printables[0] = new Book("Преступление и наказание");
        printables[1] = new Magazine("Men");
        printables[2] = new Book("Оно");
        for (Printable pr : printables) {
            pr.print();
        }
        Book.printBooks(printables);
        Magazine.printMagazines(printables);

    }
}
