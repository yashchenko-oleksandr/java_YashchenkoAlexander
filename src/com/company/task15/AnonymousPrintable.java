package com.company.task15;

import com.company.task11.classes_task1.Printable;

public class AnonymousPrintable {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Привет");
            }
        };
        p.print();
    }
}
