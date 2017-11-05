package com.company.task10.classes_task3;

public class Tulips extends Flower {
    public static int count;
    private double valueTulips;

    public Tulips() {
        valueTulips = 21;
        count++;
    }

    public Tulips(String name, String shelfLife, double valueTulips) {
        super(name, shelfLife);
        this.valueTulips = valueTulips;
        count++;
    }

    public double getValueTulips() {
        return valueTulips;
    }

    public void setValueTulips(double valueTulips) {
        this.valueTulips = valueTulips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tulips tulips = (Tulips) o;

        return Double.compare(tulips.valueTulips, valueTulips) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valueTulips);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "valueTulips=" + valueTulips +
                '}';
    }

    public double value() {
        return valueTulips;
    }
}
