package com.company.task10;

public class Rose extends Flower {
    static int count;
    public double valueRose;

    public Rose() {
        valueRose = 12;
        count++;
    }

    public Rose(String name, String shelfLife, int valueRose) {
        super(name, shelfLife);
        this.valueRose = valueRose;
        count++;
    }

    public double getValueRose() {
        return valueRose;
    }

    public void setValueRose(int valueRose) {
        this.valueRose = valueRose;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "valueRose=" + valueRose +
                '}';
    }

    public double value() {
        return valueRose;
    }
}
