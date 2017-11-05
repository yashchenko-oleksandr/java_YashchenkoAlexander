package com.company.task11.classes_task1;

public class Book implements Printable {
    private String nameBook;

    public Book() {
        nameBook = "Три богатыря";
    }

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return nameBook != null ? nameBook.equals(book.nameBook) : book.nameBook == null;
    }

    @Override
    public int hashCode() {
        return nameBook != null ? nameBook.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Печатаю книгу");
    }

    public static void printBooks(Printable[] printable) {
        for (Printable pr : printable) {
            if (pr instanceof Book) {
                System.out.println(((Book) pr).getNameBook());
            }
        }
    }
}
