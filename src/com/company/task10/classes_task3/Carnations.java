package com.company.task10.classes_task3;

public class Carnations extends Flower {
    public static int count;
    private double valueCarnations;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carnations that = (Carnations) o;

        return Double.compare(that.valueCarnations, valueCarnations) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valueCarnations);
        return (int) (temp ^ (temp >>> 32));
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
