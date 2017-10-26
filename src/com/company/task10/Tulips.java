package com.company.task10;

public class Tulips extends Flower {
    static int count;
    public double valueTulips;

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
    public String toString() {
        return "Tulips{" +
                "valueTulips=" + valueTulips +
                '}';
    }

    public double value() {
        return valueTulips;
    }
}
