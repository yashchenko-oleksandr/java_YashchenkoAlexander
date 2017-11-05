package com.company.task12.classes_task2;

public class Skirt extends Clothing implements WomenClothing {
    public Skirt() {
    }

    public Skirt(ClothingSize clothingSize, int cost, String color) {
        super(clothingSize, cost, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressWoman() {
        System.out.println("На женщине надета юбка!" + this);
    }
}
