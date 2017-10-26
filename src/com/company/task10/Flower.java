package com.company.task10;

abstract public class Flower {
    private String name, shelfLife;

    public Flower() {
        name = "Роза";
        shelfLife = "Пять дней";
    }

    public Flower(String name, String shelfLife) {
        this.name = name;
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", shelfLife='" + shelfLife + '\'' +
                '}';
    }

    abstract public double value();
}
