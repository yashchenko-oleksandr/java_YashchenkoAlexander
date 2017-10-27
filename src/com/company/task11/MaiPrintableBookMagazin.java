package com.company.task11;

/**
 * Created by Ukrainian IT_SCHOOL on 27.10.2017.
 */
public class MaiPrintableBookMagazin {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];

        printables[0] = new Book();
        printables[1] = new Magazine();

        for (Printable pr:printables){
            pr.print();
        }
    }
}
