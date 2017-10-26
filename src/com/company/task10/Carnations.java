package com.company.task10;

public class Carnations extends Flower {
    static int count;
    public double valueCarnations;

    public Carnations() {
        valueCarnations = 5;
        count++;
    }

    public Carnations(String name, String shelfLife, double valueCarnations) {
        super(name, shelfLife);
        this.valueCarnations = valueCarnations;
        count++;
    }

    public double getValueCarnations() {
        return valueCarnations;
    }

    public void setValueCarnations(int valueCarnations) {
        this.valueCarnations = valueCarnations;
    }

    @Override
    public String toString() {
        return "Carnations{" +
                "valueCarnations=" + valueCarnations +
                '}';
    }

    public double value() {
        return valueCarnations;
    }
}
