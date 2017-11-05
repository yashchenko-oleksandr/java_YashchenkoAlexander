package com.company.task11.classes_task4;

public class Guitar implements Instruments {
    private int numberOfStrings;

    public Guitar() {
        numberOfStrings = 7;
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return numberOfStrings == guitar.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return numberOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент  - Гитара, с кол-вом струн - " + getNumberOfStrings());
    }
}
