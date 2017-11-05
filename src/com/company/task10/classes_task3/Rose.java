package com.company.task10.classes_task3;

public class Rose extends Flower {
    public static int count;
    private double valueRose;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rose rose = (Rose) o;

        return Double.compare(rose.valueRose, valueRose) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valueRose);
        return (int) (temp ^ (temp >>> 32));
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
