package com.company.task10.classes_task3;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (name != null ? !name.equals(flower.name) : flower.name != null) return false;
        return shelfLife != null ? shelfLife.equals(flower.shelfLife) : flower.shelfLife == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (shelfLife != null ? shelfLife.hashCode() : 0);
        return result;
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
