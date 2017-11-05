package com.company.task12.classes_task2;

abstract public class Clothing {
    private ClothingSize clothingSize;
    private int cost;
    private String color;

    public Clothing() {
        clothingSize = ClothingSize.M;
        cost = 1243;
        color = "Красный";
    }

    public Clothing(ClothingSize clothingSize, int cost, String color) {
        this.clothingSize = clothingSize;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(ClothingSize clothingSize) {
        this.clothingSize = clothingSize;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothing clothing = (Clothing) o;

        if (cost != clothing.cost) return false;
        if (clothingSize != clothing.clothingSize) return false;
        return color != null ? color.equals(clothing.color) : clothing.color == null;
    }

    @Override
    public int hashCode() {
        int result = clothingSize != null ? clothingSize.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " " +
                "Размер одежды=" + clothingSize +
                ", Стоимость=" + cost +
                ", Цвет=" + color;
    }
}
