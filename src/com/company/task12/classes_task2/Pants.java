package com.company.task12.classes_task2;

public class Pants extends Clothing implements MenClothing, WomenClothing {
    public Pants() {
    }

    public Pants(ClothingSize clothingSize, int cost, String color) {
        super(clothingSize, cost, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void dressAMan() {
        System.out.println("На мужчине надета штаны!" + this);
    }

    @Override
    public void dressWoman() {
        System.out.println("На женщине надеты штаны!" + this);
    }
}
