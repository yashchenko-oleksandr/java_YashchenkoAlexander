package com.company.task12.classes_task2;

public class TShirt extends Clothing implements MenClothing, WomenClothing {
    public TShirt() {
    }

    public TShirt(ClothingSize clothingSize, int cost, String color) {
        super(clothingSize, cost, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressAMan() {
        System.out.println("На мужчине надета футболка!" + this);
    }

    @Override
    public void dressWoman() {
        System.out.println("На женщине надета футболка!" + this);
    }
}
