package com.company.task11.classes_task4;

public class Trumpet implements Instruments {
    private int diameter;

    public Trumpet() {
        diameter = 2;
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return diameter == trumpet.diameter;
    }

    @Override
    public int hashCode() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент - Труба, с диаметром - " + getDiameter());
    }
}
